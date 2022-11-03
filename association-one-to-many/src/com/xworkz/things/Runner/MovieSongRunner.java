package com.xworkz.things.Runner;

import com.xworkz.things.coding.MovieSong;
import com.xworkz.things.coding.Song;

public class MovieSongRunner {

	public static void main(String[] args) {
		
		Song singer = new Song();
		MovieSong song = new MovieSong();
				
		System.out.println(singer. getName());
		System.out.println(singer. getSeries());
		System.out.println(singer. getSinger());
		System.out.println(singer. getNoOfSongsc());
		System.out.println(singer. isSongFamous());
		System.out.println(singer. getViews());
		System.out.println(singer. getLyrics());
		System.out.println(singer. getLanguage());
		System.out.println(singer. getBgmVolume());
		System.out.println(singer. getMusic());
		System.out.println(singer. getOwnerOfProduction());
		System.out.println(singer. getOwnerOfProduction());
		
		
		System.out.println(System.lineSeparator());
		
		song.sing(singer);

	}

}
