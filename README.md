EaseBUY Shopping Application

EaseBUY is a mini DBMS project that simulates an online shopping application. The app is developed using Java NetBeans for the frontend and MySQL for the backend. It features functionalities like product browsing, cart management, order processing, user authentication, and profile management.

---
Features

User Authentication:

Secure Login and Registration.

Shopping Features:

Browse products by categories such as Fashion, Groceries, and Electronics.

Add products to the cart or wishlist.

Place orders directly from the cart or individual product pages.


Order Management:

View all past orders.

Edit order quantities and shipping addresses.

Cancel/delete orders.


Cart Management:

View items added to the cart.

Update item quantities in the cart.

Delete items from the cart.



---

Technologies Used

Frontend: Java (NetBeans IDE)

Backend: MySQL

Database Connectivity: JDBC


---

Screenshots

1. Product Browsing


![Screenshot 2024-11-08 114222](https://github.com/user-attachments/assets/7fc5caab-e9b5-4760-84f1-58dc0aa02f2b)

2. Order Management

![Screenshot 2024-11-08 114451](https://github.com/user-attachments/assets/88d77d6d-07a4-476b-a2e1-d9e2fc6523d0)


3. Cart Management

![Screenshot 2024-11-08 114318](https://github.com/user-attachments/assets/c65d8803-d394-46ef-b143-617855642495)



How to Run the Project

Prerequisites:

Java Development Kit (JDK) installed.

MySQL installed and running.

NetBeans IDE installed.


Steps:

1. Clone the repository:

git clone https://github.com/your-repository-link.git
cd EaseBUY


2. Import the project into NetBeans:

Open NetBeans and select File -> Open Project.

Navigate to the project folder and open it.



3. Set up the database:

Import the SQL script provided in the /database folder into MySQL to create the necessary tables.

Update the database credentials in the project's DatabaseConnection file.



4. Run the application:

In NetBeans, right-click on the project and select Run.



---

Database Structure

Tables:

1. Users: Stores user information for login and registration.

id, username, password, email, address



2. Products: Contains details of all products.

id, name, category, price, rating



3. Cart: Tracks items added to the cart by users.

cart_id, product_id, user_id, quantity



4. Orders: Stores order details placed by users.

order_id, product_id, user_id, quantity, shipping_address



---

Future Enhancements

Add payment gateway integration.

Implement advanced product filtering and search.

Include email notifications for order confirmations.

Improve UI/UX design.


---

Contributing

Contributions are welcome! Please follow the steps below:

1. Fork the repository.


2. Create a new branch:

git checkout -b feature-name


3. Commit your changes:

git commit -m "Added a new feature"


4. Push to the branch:

git push origin feature-name


5. Open a pull request.




---

License![Uploading Screenshot 2024-11-08 114517.png…]()


This project is licensed under the MIT License. See the LICENSE file for details.


---

Contact

For any queries or suggestions, feel free to contact me at [abin@lbscek.ac.in].
