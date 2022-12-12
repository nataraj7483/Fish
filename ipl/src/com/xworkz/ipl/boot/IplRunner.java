package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {
	IplRepository repository=new IplRepositoryImpl();
	
	IplDTO dto=new IplDTO();
	dto.setTeamName("jammu and kashmir");
	dto.setCaptainName("Modi");
    dto.setOwnerAlive(true);
    dto.setPurse(50);
    dto.setWins(370);
    dto.setDefeats(0);
    dto.setCreatedBy("Amith shaw");
    dto.setCreatedDate(LocalDateTime.now());
    
    repository.create(dto);
    
    IplDTO rcb=new IplDTO();
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    
    rcb.setTeamName("RCB");
	rcb.setCaptainName("Duplesi");
	rcb.setOwnerAlive(true);
	rcb.setPurse(18);
	rcb.setWins(121);
	rcb.setDefeats(117);
	rcb.setCreatedBy("Raj");
	rcb.setCreatedDate(LocalDateTime.now());
    
	repository.create(rcb);
    
	  IplDTO delhi=new IplDTO();
	  System.out.println("//////////////////////////");
	  
	  delhi.setTeamName("Dlhi Capitals");
	  delhi.setCaptainName("Panth");
	  delhi.setOwnerAlive(true);
	  delhi.setPurse(19);
	  delhi.setWins(190);
	  delhi.setDefeats(167);
	  delhi.setCreatedBy("Raj");
	  delhi.setCreatedDate(LocalDateTime.now());
	    
		repository.create(delhi);
		
		IplDTO kings=new IplDTO();
		System.out.println("////////////////////////////");
		kings.setTeamName("Punjab Kings");
		kings.setCaptainName("Mayank Agarwal");
		kings.setOwnerAlive(true);
		kings.setPurse(180);
		kings.setWins(197);
		kings.setDefeats(169);
		kings.setCreatedBy("Raj");
		kings.setCreatedDate(LocalDateTime.now());
		    
			repository.create(kings);
			
			IplDTO royals=new IplDTO();
			System.out.println("////////////////////////////");
			royals.setTeamName("Rajastan Royals");
			royals.setCaptainName("Sanju Samson");
			royals.setOwnerAlive(true);
			royals.setPurse(181);
			royals.setWins(191);
			royals.setDefeats(163);
			royals.setCreatedBy("Raj");
			royals.setCreatedDate(LocalDateTime.now());
			    
				repository.create(royals);
		
				IplDTO titans=new IplDTO();
				System.out.println("////////////////////////////");
				titans.setTeamName("Gujarath Titans");
				titans.setCaptainName("Hardthik Pandya");
				titans.setOwnerAlive(true);
				titans.setPurse(120);
				titans.setWins(12);
				titans.setDefeats(4);
				titans.setCreatedBy("Raj");
				titans.setCreatedDate(LocalDateTime.now());
				    
					repository.create(titans);
			
					IplDTO giants=new IplDTO();
					System.out.println("////////////////////////////");
					giants.setTeamName("Lucknow Super Giants");
					giants.setCaptainName("KL Rahul");
					giants.setOwnerAlive(true);
					giants.setPurse(17);
					giants.setWins(9);
					giants.setDefeats(6);
					giants.setCreatedBy("Raj");
					giants.setCreatedDate(LocalDateTime.now());
					    
						repository.create(giants);
						
						IplDTO riders=new IplDTO();
						System.out.println("////////////////////////////");
						riders.setTeamName("Kolkata Knight Riders");
						riders.setCaptainName("Shreyas Iyer");
						riders.setOwnerAlive(true);
						riders.setPurse(170);
						riders.setWins(119);
						riders.setDefeats(126);
						riders.setCreatedBy("Raj");
						riders.setCreatedDate(LocalDateTime.now());
						    
							repository.create(riders);	
						
							IplDTO indians=new IplDTO();
							System.out.println("////////////////////////////");
							indians.setTeamName("Mumbai Indians");
							indians.setCaptainName("Rohith");
							indians.setOwnerAlive(true);
							indians.setPurse(180);
							indians.setWins(200);
							indians.setDefeats(129);
							indians.setCreatedBy("Raj");
							indians.setCreatedDate(LocalDateTime.now());
							    
								repository.create(indians);	
								
								IplDTO hyderabad=new IplDTO();
								System.out.println("////////////////////////////");
								hyderabad.setTeamName("Sunrisers Hyderabad");
								hyderabad.setCaptainName("Kanewilliams");
								hyderabad.setOwnerAlive(true);
								hyderabad.setPurse(19);
								hyderabad.setWins(201);
								hyderabad.setDefeats(145);
								hyderabad.setCreatedBy("Raj");
								hyderabad.setCreatedDate(LocalDateTime.now());
								    
									repository.create(hyderabad);			
				
	}

}
