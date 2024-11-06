package com.ksk.subway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubwayApplication {

	public static void main(String[] args) {

		SpringApplication.run(SubwayApplication.class, args);
//		Scanner scanner = new Scanner(System.in);
//
//		Map<String, Station> stations = new HashMap<>();
//		stations.put("Holborn", new Station("Holborn", List.of(1)));
//		stations.put("Earl's Court", new Station("Earl's Court", List.of(1, 2)));
//		stations.put("Hammersmith", new Station("Hammersmith", List.of(3)));
//		stations.put("Wimbledon", new Station("Wimbledon", List.of(2)));
//
//		System.out.print("Enter initial balance: £");
//		double initialBalance = scanner.nextDouble();
//		OysterCard card = new OysterCard(initialBalance);
//
//		while (true) {
//			System.out.println("\nChoose an option:");
//			System.out.println("1. Tube Journey");
//			System.out.println("2. Bus Journey");
//			System.out.println("3. Check Balance");
//			System.out.println("4. Exit");
//			System.out.print("Option: ");
//			int option = scanner.nextInt();
//			scanner.nextLine();
//
//			switch (option) {
//				case 1:
//					System.out.print("Enter entry station: ");
//					String entryStationName = scanner.nextLine();
//					Station entryStation = stations.get(entryStationName);
//
//					if (entryStationName == null) {
//						System.out.println("Invalid station name. Try again.");
//						break;
//					}
//
//					card.swipeIn(entryStation);
//
//					System.out.print("Enter exit station: ");
//					String exitStationName = scanner.nextLine();
//					Station exitStation = stations.get(exitStationName);
//
//					if (exitStation == null) {
//						System.out.println("Invalid station name. Try again.");
//						break;
//					}
//
//					card.swipeOut(exitStation);
//					break;
//
//				case 2:
//					card.takeBus();
//					break;
//
//				case 3:
//					System.out.println("Current balance: £" + card.getBalance());
//					break;
//
//				case 4:
//					System.out.println("Thank you for using the Oyster card system. Goodbye!");
//					scanner.close();
//					return;
//
//				default:
//					System.out.println("Invalid option. Try again.");
//			}
//		}
	}


}
