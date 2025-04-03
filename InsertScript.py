import mysql.connector
import csv

db_config = {
    "host": "localhost",
    "user": "root",
    "password": "*Kn36924680",
    "database": "medassistbackend",
    "port": 3306  # Default MySQL port
}
# Database Configuration
db = mysql.connector.connect(**db_config)
if db.is_connected():
        print("Connected to MySQL successfully!")
cursor = db.cursor()


csv_file_path = r"D:\Dataset\Medicine_Details.csv"  # Replace with your CSV file path


batch_size = 1000  
with open(csv_file_path, "r", encoding="utf-8") as file:
    reader = csv.DictReader(file)
    batch = []

    for row in reader:
        batch.append((  row["Medicine_Name"], row["Uses"], row["Side_effects"], row["Image_URL"], row["Manufacturer"]))
        
        if len(batch) == batch_size:
            insert_query = """
            insert into Products ( ProductName, Uses, Side_effects, Image_url, Manufacturer)
            VALUES (%s, %s, %s,%s,%s);
            """
            cursor.executemany(insert_query, batch)
            db.commit()
            print(f"Inserted {batch_size} rows.")
            batch = []  
    if batch:
        insert_query = """
        insert into Products ( ProductName, Uses, Side_effects, Image_url, Manufacturer)
        VALUES (%s, %s, %s, %s,%s);
        """
        cursor.executemany(insert_query, batch)
        db.commit()
        print(f"Inserted remaining {len(batch)} rows.")

print("Data insertion completed successfully!")

# Closing the connection
cursor.close()
db.close()
