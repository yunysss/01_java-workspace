package com.br.chap02_byte.run;

import com.br.chap02_byte.model.dao.FileByteDao;

public class FileByteRun {

	public static void main(String[] args) {
		
		FileByteDao fbd = new FileByteDao();
		//fbd.fileSave();
		fbd.fileRead();
	}

}
