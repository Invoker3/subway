# Oyster Card System

## Introduction

This project simulates a simplified version of the London Oyster card system, which is used for public transportation. The application allows users to load money onto an Oyster card, take journeys via tube or bus, and calculates the fare based on the journey details.

## Features

- **Load Balance:** Users can load an initial balance onto their Oyster card.
- **Tube Journeys:** Fare calculation based on the zones traveled through, with logic for:
    - Journeys within Zone 1.
    - Journeys across multiple zones, including and excluding Zone 1.
    - The system deducts the maximum fare when a journey starts and adjusts the fare based on the actual journey when it ends.
- **Bus Journeys:** A flat fare of £1.80 is charged for all bus journeys.
- **Balance Management:** The system tracks the remaining balance after each journey and prevents journeys if the balance is insufficient.

## Project Structure

- `Station`: Represents a station and its associated zones.
- `Journey`: Contains logic for calculating the fare based on the entry and exit stations.
- `OysterCard`: Manages the balance, swiping in/out operations, and bus journeys.
- `Main`: Handles user interaction and orchestrates the overall system.

## Installation and Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/oyster-card-system.git
   cd oyster-card-system
