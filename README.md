# 💸 Expense Tracker Android App

[![Android CI](https://github.com/nandeesh2799/ExpenseTrackerAndroid/actions/workflows/ci.yml/badge.svg)](https://github.com/nandeesh2799/ExpenseTrackerAndroid/actions/workflows/ci.yml)
[![Tests Passing](https://img.shields.io/badge/Unit%20Tests-16%2F16%20Passing-brightgreen?style=flat&logo=junit5)](https://github.com/nandeesh2799/ExpenseTrackerAndroid)
[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![SQLite](https://img.shields.io/badge/SQLite-003B57?style=for-the-badge&logo=sqlite&logoColor=white)](https://www.sqlite.org/)

**Expense Tracker** is a modern Android application built with Java, SQLite, and Gradle. It helps users manage daily expenses, track income streams, monitor monthly budget utilization with real-time calculations, and receive smart reminders — all packaged in a clean Material Design gradient UI.

---

## 📱 Features

- ➕ **Add Income & Expenses** – Quick entry with amount, category, and notes  
- 📜 **Transaction History** – View all past transactions in a scrollable list  
- 📂 **Category‑wise Summary** – See how much you spend on food, travel, bills, etc.  
- 📅 **Monthly Reports** – Analyse income vs expenses for any month  
- 💰 **Budget Tracking** – Set monthly budgets and visualise progress with a progress bar  
- 🔔 **Smart & Funny Notifications** – Get engaging alerts (like Swiggy/Zomato style 😄)  
- 🎨 **Modern UI** – Smooth gradients, material design, and intuitive layout  

---

## 🛠️ Tech Stack

| Layer       | Technology                    |
|-------------|-------------------------------|
| Language    | Java                          |
| IDE         | Android Studio                |
| Database    | SQLite (local)                |
| UI          | XML (Material Design + Gradients) |
| Version Control | Git & GitHub              |

---

## 📸 Screenshots


| Home Screen | Add Transaction | Monthly Report |
|-------------|----------------|----------------|
| ![Home](screenshots/home.png) | ![Add](screenshots/add_transaction.png) | ![Report](screenshots/monthly_report.png) |

| Notifications | Category Summary |
|---------------|------------------|
| ![Notification](screenshots/notification.png) | ![Category](screenshots/category_summary.png) |


---

## 🚀 How to Run

1.  **Clone the Repository**
    ```bash
    git clone https://github.com/nandeesh2799/expense-tracker.git
    ```
2.  **Open in Android Studio**
    Launch Android Studio and select `Open an Existing Project`, then navigate to the cloned directory.
3.  **Sync Gradle**
    Wait for Android Studio to sync dependencies.
4.  **Run**
    Connect your physical device via USB or start an emulator and click the **Run (▶️)** button.

---

## 🧪 Automated Testing & CI/CD

The repository includes a decoupled JUnit unit testing suite validating financial computation algorithms, currency parsing, and data models independently of the Android OS runtime.

### Running Unit Tests locally

```bash
# Execute JVM unit tests (16 tests across FinancialCalculations, CurrencyUtils, and TransactionModel)
./gradlew testDebugUnitTest
```

### Building the Debug APK

```bash
./gradlew assembleDebug
```

### Continuous Integration

Every push and pull request against `main` or `master` triggers a GitHub Actions workflow (`.github/workflows/ci.yml`) running on Ubuntu with Temurin JDK 21 that validates all unit tests and compiles the debug APK.

---

## 📈 Future Improvements

- [ ] **Firebase Integration:** For cloud synchronization and user authentication.
- [ ] **Data Visualization:** Integration of Pie and Bar charts for expense analytics.
- [ ] **Dark Mode Support:** System-wide dark theme compatibility 🌙.
- [ ] **Data Export:** Generate and export financial reports in PDF or Excel formats.

---

## 👨‍💻 Author

**Nandeesh N K**   **GitHub:** [@nandeesh2799](https://github.com/nandeesh2799)

---

## ⭐ Support

If you find this project useful, please consider giving it a **Star** on GitHub!
