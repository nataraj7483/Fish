package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {

		PlaceDTO dto1 = new PlaceDTO("Chitradurga","KallinaKote", "HinduMaha Ganapathi");
		PlaceDTO dto2 = new PlaceDTO("Hosadurga","Dhasharatha Rameshwara", "KanchivaradaRaja");
		PlaceDTO dto3 = new PlaceDTO("Davangere","BenneDose", "HinduMaha Ganapathi");
		PlaceDTO dto4 = new PlaceDTO("Tipture","Cocanut", "Ganapathi");
		PlaceDTO dto5 = new PlaceDTO("Mathodu","Bakery", "KashiBagirathi");
		
		boolean equals = dto1.equals(dto3);
		System.out.println( equals);
		
		Collection<PlaceDTO> place = new ArrayList<PlaceDTO>();
		place.add(dto1);
		place.add(dto2);
		
		boolean contains = place.contains(dto3);
		System.out.println("contains:" +contains);
		
		
	}

}
