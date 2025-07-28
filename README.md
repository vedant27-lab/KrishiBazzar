<h1>🌾Krishi Bazzar</h1>

<p>An open-source Farmer-to-Consumer web platform designed to empower Indian farmers by enabling direct crop sales without intermediaries.</p>

## 📌 Features

- 👨‍🌾 **Farmer Login & Crop Listing**
- 🛒 **Consumer Login & Order Placement**
- 🧾 **Real-Time Inventory Updates**
- 💬 **Integrated Feedback System**
- 📍 **Location-Based Recommendations**
- 🔐 **Secure Authentication System**
- 📈 **Admin Dashboard (coming soon)**

---

## 🧑‍💻 Tech Stack

| Frontend   | Backend       | Database   | Others                  |
|------------|---------------|------------|--------------------------|
| Angular    | Java Spring Boot | MySQL      | REST APIs, JWT, Spring Security |


## 📦 Project Structure

krishi-bazzar/
├── frontend/ # Angular app
├── backend/ # Spring Boot app
├── database/ # SQL scripts (schema + seed)
├── docs/ # Architecture, diagrams, API specs
└── README.md


---

## 🚀 Getting Started

### Prerequisites

- Node.js & Angular CLI
- Java 17+
- MySQL Server

### Clone and Run Locally

```bash
git clone https://github.com/your-username/krishi-bazzar.git
cd krishi-bazzar

# Run Backend
cd backend
./mvnw spring-boot:run

# Run Frontend
cd ../frontend
npm install
ng serve

