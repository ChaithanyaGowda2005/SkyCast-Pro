# ☁ SkyCast Pro

A modern desktop weather application built using **JavaFX** that provides real-time weather information for any city using the **OpenWeatherMap API**.

---

## 📌 Features

- 🔍 Search weather by city name
- 🌡 Current temperature
- 🤒 Feels like temperature
- 💧 Humidity
- 🌬 Wind speed
- 🧭 Atmospheric pressure
- 👁 Visibility
- 🌍 Country
- 🌅 Sunrise time
- 🌇 Sunset time
- ☁ Live weather icon
- 🎨 Modern JavaFX User Interface

---

## 🖥️ Technologies Used

- Java 17
- JavaFX
- Maven
- Jackson Databind
- OpenWeatherMap API
- CSS
- FXML
- IntelliJ IDEA

---

## 📁 Project Structure

```
SkyCast-Pro
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.chaithanya.skycast
│   │   │       ├── controller
│   │   │       ├── model
│   │   │       ├── service
│   │   │       └── Main.java
│   │   │
│   │   └── resources
│   │       ├── css
│   │       └── view
│   │
├── pom.xml
└── README.md
```

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/ChaithanyaGowda2005/SkyCast-Pro.git
```

### 2. Open the project

Open the project using **IntelliJ IDEA**.

### 3. Install Maven dependencies

Allow Maven to download all required dependencies.

### 4. Add your API Key

Open:

```
WeatherService.java
```

Replace:

```java
private static final String API_KEY = "a1083bce5d3d85401a25807237dc6fed";
```

with your own OpenWeatherMap API key.

### 5. Run the project

Run:

```
Main.java
```

---

## 📷 Application Preview

The application displays:

- Weather icon
- City name
- Temperature
- Weather description
- Feels Like
- Humidity
- Wind Speed
- Pressure
- Visibility
- Country
- Sunrise
- Sunset

---

## 🌐 Weather API

This project uses the **OpenWeatherMap API**.

https://openweathermap.org/api

---

## 🎯 Future Improvements

- 5-Day Weather Forecast
- Dark Mode
- Automatic Location Detection
- Weather Alerts
- Air Quality Index (AQI)
- Unit Conversion (°C / °F)
- Recent Search History

---

## 👨‍💻 Author

**Chaithanya**

Java Full Stack Developer

---

## 📄 License

This project is created for educational and learning purposes.