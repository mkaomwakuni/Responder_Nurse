# Responder Nurse App

Welcome to the **Nurse Responder App**! This is a **cross-platform application** built using **Kotlin Multiplatform (KMP)** and **Compose Multiplatform** to help nurses and administrators manage medical emergencies efficiently. The app provides real-time location tracking, incident management, and analytics for better decision-making.

---

## Features

### For Nurses
- **Real-Time Location Tracking:** Track your location using GPS and share it with administrators.
- **Panic Button:** Instantly trigger an emergency alert for immediate assistance.
- **Incident Reporting:** Log incident details, upload photos, and record audio.
- **In-App Navigation:** Get directions to the incident location using Google Maps.
- **Real-Time Chat:** Communicate with administrators and other responders.

### For Administrators
- **Analytics Dashboard:** View response times, incident trends, and nurse availability.
- **Incident Management:** Assign responders, track incident status, and generate reports.
- **Real-Time Alerts:** Receive notifications for new incidents and escalations.
- **User Management:** Manage nurse accounts and roles.

---

## Technologies & Libraries Used

### Mobile & Desktop Development
- **Kotlin Multiplatform (KMP):** Shared business logic across Android and Desktop.
- **Compose Multiplatform:** Declarative UI framework for Android and Desktop.
- **Google Maps API:** Real-time navigation and location tracking.

### Backend & Database
- **Firebase Firestore:** Real-time NoSQL database for incident and user data.
- **Firebase Authentication:** Secure login and role-based access control.
- **Firebase Realtime Database:** Real-time chat functionality.

### Networking & Local Storage
- **Ktor:** HTTP client for API communication.
- **SQLDelight:** Local database for offline functionality.

### Analytics & Visualization
- **Chart.js:** Interactive charts for performance metrics.
- **Firebase Analytics:** Monitor app usage and performance.

---

## Getting Started

### Prerequisites
- Android Studio or IntelliJ IDEA (2023.1+)
- JDK 17+
- Firebase account (for Firestore and Authentication)

### Installation
1. Clone the repository:
   ```bash  
   git clone https://github.com/your-username/emergency-responder-app.git  
   ```  
2. Open the project in Android Studio or IntelliJ IDEA.
3. Add your Firebase configuration files:
  - Place `google-services.json` in `androidApp/src/main/`.
  - Add Firebase config to `shared/src/androidMain/kotlin/FirestoreManager.kt`.
4. Run the app:
  - For Android: Use the Android emulator or a physical device.
  - For Desktop: Run the `desktopApp` module.

---

## Contributing

We welcome contributions! Please follow these steps:
1. Fork the repository.
2. Create a new branch:
   ```bash  
   git checkout -b feature/your-feature-name  
   ```  
3. Commit your changes:
   ```bash  
   git commit -m "Add your feature"  
   ```  
4. Push to the branch:
   ```bash  
   git push origin feature/your-feature-name  
   ```  
5. Open a pull request.

---

## Contact

For questions or feedback, feel free to reach out:
- **Email:** cnoceania@gmail.com
- **GitHub:** [MkaoCodes](https://github.com/mkaomwakuni)
---

