package com.tka.eci.service;

import java.util.ArrayList;
import java.util.List;
import com.tka.eci.dao.ECIDao;
import com.tka.eci.entity.ECICandidate;

public class ECIService {

	ECIDao  dao=null;

	public List<ECICandidate> getAllCandidates(){
		dao=new ECIDao();
		List<ECICandidate> allCandidates = dao.getAllCandidates();
		return allCandidates;

	}

	public List<ECICandidate> getAllSouthNagpurCandidates() {
		List<ECICandidate> allSouthNagpurCandidates =new ArrayList<ECICandidate>();
		dao=new ECIDao();
		List<ECICandidate> allCandidates = dao.getAllCandidates();

		for (ECICandidate SouthNagpurCandidates : allCandidates) {

			if(SouthNagpurCandidates.getAssembly().equals("NAGPUR SOUTH")) {

				allSouthNagpurCandidates.add(SouthNagpurCandidates);
			}
		}
		
		return allSouthNagpurCandidates;
	}

	public List<ECICandidate> getAllNorthNagpurCandidates() {
		
		List<ECICandidate> allNorthNagpurCandidates =new ArrayList<ECICandidate>();
		dao=new ECIDao();
		List<ECICandidate> allCandidates = dao.getAllCandidates();

		for (ECICandidate NorthNagpurCandidates : allCandidates) {

			if(NorthNagpurCandidates.getAssembly().equals("NAGPUR NORTH")) {

				allNorthNagpurCandidates.add(NorthNagpurCandidates);
			}
		}
		
		return allNorthNagpurCandidates;
	}

	public List<ECICandidate> getAllCentalNagpurCandidates() {
		List<ECICandidate> allCentalNagpurCandidates =new ArrayList<ECICandidate>();
		dao=new ECIDao();
		List<ECICandidate> allCandidates = dao.getAllCandidates();

		for (ECICandidate CentalNagpurCandidates : allCandidates) {

			if(CentalNagpurCandidates.getAssembly().equals("NAGPUR CENTRAL")) {

				allCentalNagpurCandidates.add(CentalNagpurCandidates);
			}
		}
		
		return allCentalNagpurCandidates;
	}

	public List<ECICandidate> getAllEastNagpurCandidates() {
		List<ECICandidate> allEastNagpurCandidates =new ArrayList<ECICandidate>();
		dao=new ECIDao();
		List<ECICandidate> allCandidates = dao.getAllCandidates();

		for (ECICandidate EastNagpurCandidates : allCandidates) {

			if(EastNagpurCandidates.getAssembly().equals( "NAGPUR EAST")) {

				allEastNagpurCandidates.add(EastNagpurCandidates);
			}
		}
		
		return allEastNagpurCandidates;
	}

	public List<ECICandidate> getAllWestNagpurCandidates() {
		List<ECICandidate> allWestNagpurCandidates =new ArrayList<ECICandidate>();
		dao=new ECIDao();
		List<ECICandidate> allCandidates = dao.getAllCandidates();

		for (ECICandidate WestNagpurCandidates : allCandidates) {

			if(WestNagpurCandidates.getAssembly().equals( "NAGPUR WEST")) {

				allWestNagpurCandidates.add(WestNagpurCandidates);
			}
		}
		
		return allWestNagpurCandidates;
	}

	public List<ECICandidate> getAllSouthNorthNagpurCandidates() {
		List<ECICandidate> allSouthNorthNagpurCandidates =new ArrayList<ECICandidate>();
		dao=new ECIDao();
		List<ECICandidate> allCandidates = dao.getAllCandidates();

		for (ECICandidate SouthNorthNagpurCandidates : allCandidates) {

			if(SouthNorthNagpurCandidates.getAssembly().equals("NAGPUR SOUTH-NORTH")) {

				allSouthNorthNagpurCandidates.add(SouthNorthNagpurCandidates);
			}
		}
		
		return allSouthNorthNagpurCandidates;
	}

	public List<ECICandidate> getAllBJPCandidates() {
		List<ECICandidate> allBJPCandidates =new ArrayList<ECICandidate>();
		dao=new ECIDao();
		List<ECICandidate> allCandidates = dao.getAllCandidates();

		for (ECICandidate allBJP : allCandidates) {

			if(allBJP.getPartyname().equals("Bharatiya Janata Party")) {

				System.out.println(allBJP);
			}
		}
		
		return allBJPCandidates;
	}
	
	
	public List<ECICandidate> getCandidatesbyage() {
	    List<ECICandidate> candidatesByAge = new ArrayList<>();
	    dao = new ECIDao();
	    List<ECICandidate> allCandidates = dao.getAllCandidates();

	    for (ECICandidate candidate : allCandidates) {
	        if (candidate.getAge() <= 40) {
	            System.out.println(candidate);
	            candidatesByAge.add(candidate); 
	        }
	    }

	    return candidatesByAge;
	}
}