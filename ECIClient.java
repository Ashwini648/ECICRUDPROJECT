package com.tka.eci.client;

import java.util.List;

import com.tka.eci.controller.ECIController;
import com.tka.eci.entity.ECICandidate;

public class ECIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ECIController controller=new ECIController();
		List<ECICandidate> allCandidates = controller.getAllCandidates();

		//		all candidates present in the list of ECI....
		System.out.println("All Candidate present in List:");
		System.out.println(".............................................");
		for (ECICandidate eciCandidate : allCandidates) {
			System.out.println(eciCandidate);
		}
		System.out.println(".............................................");

		//All candidates present in south nagpur....
		System.out.println("All Candidate present in SouthNagpur:");
		System.out.println(".............................................");
		List<ECICandidate> allSouthNagpurCandidates = controller.getAllSouthNagpurCandidates();
		for (ECICandidate SouthNagpurCandidates: allSouthNagpurCandidates) {
			System.out.println(SouthNagpurCandidates);
		}

		System.out.println(".............................................");
		//All candidates present in north nagpur....
		System.out.println("All Candidate present in NorthNagpur:");
		System.out.println(".............................................");
		List<ECICandidate> allNorthNagpurCandidates = controller.getAllNorthNagpurCandidates();
		for (ECICandidate NorthNagpurCandidates: allNorthNagpurCandidates) {
			System.out.println(NorthNagpurCandidates);
		}

		System.out.println(".............................................");
		//All candidates present in central nagpur....
		System.out.println("All Candidate present in CentralNagpur:");
		System.out.println(".............................................");
		List<ECICandidate> allCentalNagpurCandidates = controller.getAllCentalNagpurCandidates();
		for (ECICandidate CentalNagpurCandidates: allCentalNagpurCandidates) {
			System.out.println(CentalNagpurCandidates);
		}


		System.out.println(".............................................");
		//All candidates present in east nagpur....
		System.out.println("All Candidate present in SouthNagpur:");
		System.out.println(".............................................");
		List<ECICandidate> allEastNagpurCandidates = controller.getAllEastNagpurCandidates();
		for (ECICandidate EastNagpurCandidates: allEastNagpurCandidates) {
			System.out.println(EastNagpurCandidates);
		}

		System.out.println(".............................................");
		//		All candidates present in west nagpur....
		System.out.println("All Candidate present in SouthNagpur:");
		System.out.println(".............................................");
		List<ECICandidate> allWestNagpurCandidates = controller.getAllWestNagpurCandidates();
		for (ECICandidate WestNagpurCandidates: allWestNagpurCandidates) {
			System.out.println(WestNagpurCandidates);
		}

		System.out.println(".............................................");
		//		All candidates present in southnorth nagpur....
		System.out.println("All Candidate present in SouthNagpur:");
		System.out.println(".............................................");
		List<ECICandidate> allSouthNorthNagpurCandidates = controller.getAllSouthNorthNagpurCandidates();
		for (ECICandidate SouthNorthNagpurCandidates: allSouthNorthNagpurCandidates) {
			System.out.println(SouthNorthNagpurCandidates);
		}

		System.out.println(".............................................");
		//All candidates present in "Bharatiya Janata Party"....
		System.out.println("All Candidate present in Bharatiya Janata Party:");
		System.out.println(".............................................");
		List<ECICandidate> allBJPCandidates = controller.getAllBJPCandidates();
		for (ECICandidate BJP:allBJPCandidates) {
			System.out.println(BJP);
		}

		System.out.println(".............................................");
		//All candidates present in "Bharatiya Janata Party"....
		System.out.println("All Candidate BY Age:");
		System.out.println(".............................................");
		List<ECICandidate> candidatesbyage = controller.getCandidatesbyage();
		for (ECICandidate byage : candidatesbyage) {
			System.out.println(byage);
		}

	}


}
