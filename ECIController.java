package com.tka.eci.controller;

import java.util.List;

import com.tka.eci.entity.ECICandidate;
import com.tka.eci.service.ECIService;

public class ECIController {
	
	ECIService service=null;
	
	public List<ECICandidate> getAllCandidates(){
		service=new ECIService();
		List<ECICandidate> allCandidates = service.getAllCandidates();
		return allCandidates  ;
		
	}

	public List<ECICandidate> getAllSouthNagpurCandidates() {
		service=new ECIService();
		List<ECICandidate> allSouthNagpurCandidates = service.getAllSouthNagpurCandidates();
		return allSouthNagpurCandidates  ;
	}

	public List<ECICandidate> getAllNorthNagpurCandidates() {
		service=new ECIService();
		List<ECICandidate> allNorthNagpurCandidates = service.getAllNorthNagpurCandidates();
		return allNorthNagpurCandidates  ;
	}

	public List<ECICandidate> getAllCentalNagpurCandidates() {
		service=new ECIService();
		List<ECICandidate> allCentalNagpurCandidates = service.getAllCentalNagpurCandidates();
		return allCentalNagpurCandidates  ;
	}

	public List<ECICandidate> getAllEastNagpurCandidates() {
		service=new ECIService();
		List<ECICandidate> allEastNagpurCandidates = service.getAllEastNagpurCandidates();
		return allEastNagpurCandidates;
	}

	public List<ECICandidate> getAllWestNagpurCandidates() {
		service=new ECIService();
		List<ECICandidate> allWestNagpurCandidates = service.getAllWestNagpurCandidates();
		return allWestNagpurCandidates;
	}

	public List<ECICandidate> getAllSouthNorthNagpurCandidates() {
		service=new ECIService();
		List<ECICandidate> allSouthNorthNagpurCandidates = service.getAllSouthNorthNagpurCandidates();
		return allSouthNorthNagpurCandidates;
	}

	public List<ECICandidate> getAllBJPCandidates() {
		service = new ECIService();
		List<ECICandidate> BJP = service.getAllBJPCandidates();
		return BJP;
	}

	public List<ECICandidate> getCandidatesbyage() {
		service = new ECIService();
		List<ECICandidate> byage = service.getCandidatesbyage();
		return byage;
	}
}
