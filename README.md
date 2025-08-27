# Attendance System

[![Java](https://img.shields.io/badge/Java-8%2B-blue.svg)](https://www.oracle.com/java/)
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-brightgreen.svg)](https://netbeans.apache.org/)
[![Platform](https://img.shields.io/badge/Platform-macOS%20%7C%20Windows%20%7C%20Linux-lightgrey.svg)]()
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A face recognition-based attendance system built with Java and NetBeans. Includes all required JARs and recognition assets for easy setup.

## Features

- Face recognition for student attendance
- Java Swing GUI
- Local database support (MS Access)
- Bundled third-party JARs for convenience
- Haar cascade models included

## Getting Started

1. **Clone the repository:**
   ```sh
   git clone https://github.com/samarth-misal64/attendace-system.git
   cd attendace-system
   ```

2. **Open in NetBeans:**
   - Use NetBeans IDE for best compatibility.
   - All dependencies are included in the `jars/` and `lib/` folders.

3. **Build & Run:**
   - Use NetBeans "Clean and Build" and "Run" actions.
   - Or from terminal:
     ```sh
     ant clean
     ant build
     ant run
     ```

4. **Database:**
   - The project uses an MS Access database (`attendance_db/face_recog_db.accdb`).
   - Make sure you have the required drivers (bundled in `jars/ucanaccess/`).

## Project Structure

- `src/` - Java source code
- `jars/`, `lib/` - Required JAR dependencies
- `src/recognition/` - Haar cascade and recognition models
- `attendance_db/` - Database files

## Contributing

Pull requests and issues are welcome!

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
