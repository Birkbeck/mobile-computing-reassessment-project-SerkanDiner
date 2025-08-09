[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zHeiFeFc)



# 📱 Movie Tracker – Coursework 1

## 🎯 Project Overview
This repository contains **Coursework 1** for the *Mobile Computing 2025* module.  
The aim of this stage is to design and implement the **UI of an Android application** (in Kotlin) for tracking movies, without yet implementing the full business logic.

Key objectives achieved:
- Created wireframes for all screens before coding.
- Built **static UI layouts** in XML for all required activities.
- Prepared the project for **Coursework 2** functionality implementation.
- Followed professional development practices (Git version control, structured folders, meaningful commits).

---

## 📂 Application Structure
### **Activities**
| Activity Name        | Purpose | Layout File |
|----------------------|---------|-------------|
| `MainActivity`       | Displays the list of movies and a category filter. Includes a Floating Action Button (FAB) to navigate to the Add Movie screen. | `res/layout/activity_main.xml` |
| `AddMovieActivity`   | UI for adding a new movie (Title + Category). | `res/layout/activity_add_movie.xml` |
| `MovieDetailActivity`| UI for viewing, editing, and deleting a selected movie. | `res/layout/activity_movie_detail.xml` |

### **Other Layouts**
| Layout File | Purpose |
|-------------|---------|
| `item_movie.xml` | Defines the appearance of a single movie in the RecyclerView list. |

---

## 🖌️ Wireframes
The initial design of the application was created in wireframe format to plan the user interface and user flow.  
This ensured that the UI implementation followed a structured, pre-approved design.

📄 **View the wireframe here**:  
[Movie Tracker Wireframe (PDF)](Movie-tracker-wireframe.pdf)

---

## 🛠️ How to Run the Application
1. Clone or download this repository to your local machine.
2. Open the project in **Android Studio**.
3. Ensure all Gradle dependencies are synced (`File → Sync Project with Gradle Files`).
4. Run the app on an emulator or physical device.
5. **Testing Navigation (CW1 only)**:
    - From the main screen, tap the FAB to open the Add Movie screen (temporary code for CW1 preview).
    - Functionality such as saving, editing, and deleting movies will be implemented in **Coursework 2**.

---

## 📋 CW1 Requirements Mapping
| Coursework 1 Requirement | How It Was Achieved |
|--------------------------|----------------------|
| Create wireframes with descriptions | Created `Movie-tracker-wireframe.pdf` showing all screens and describing elements. |
| Basic Android project created | Project set up in Kotlin with package `com.sdiner01.movietrackerapp`. |
| Activities/fragments as placeholders | `MainActivity`, `AddMovieActivity`, and `MovieDetailActivity` implemented. |
| Static UI layouts only (no logic) | All layouts created in XML with placeholder text/mock data. |
| Reusable item layout for list | `item_movie.xml` created for RecyclerView row design. |
| GitHub version control | Multiple commits showing incremental progress. |

---

## 📄 Notes
- This submission focuses solely on **UI design** (as per CW1 guidelines).
- All code is **original work**; any external resources are acknowledged.
- The project is fully prepared for the **Room database and logic implementation** required in Coursework 2.

---

## ✅ Next Steps (Coursework 2)
In the next stage, the following will be implemented:
- Room database for persistent movie storage.
- Full CRUD operations (Create, Read, Update, Delete).
- Navigation between screens with data transfer.
- RecyclerView adapter for dynamic list updates.
- Unit tests for DAO and repository layers.
