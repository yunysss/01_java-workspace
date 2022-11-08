package com.br.chap04_assist.part01_buffered.run;

import com.br.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		BufferedDao dao = new BufferedDao();
		//dao.fileSave();
		dao.fileRead();
		
	}

}
