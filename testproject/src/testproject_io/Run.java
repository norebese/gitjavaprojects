package com.kh.io;

import java.io.*;

public class Run {
   public static void main(String[] args) {
      String filePath = "myFile.txt";

     
      try (FileWriter bw= new FileWriter("myFile.txt", true);){
    	  bw.write("안녕하세요");
    	  bw.write("반갑습니다");
      } catch(FileNotFoundException e) {
    	  e.printStackTrace();
      }catch(IOException e) {
    	  e.printStackTrace();
      }
      
      
      
      
      
      try {
         File file = new File(filePath);
         boolean isFileCreated = file.createNewFile();

         if (isFileCreated) {
            System.out.println("파일 생성 완료 : " + filePath);
         } else {
            System.out.println("파일 생성 실패");
         }
      } catch (IOException e) {
         e.printStackTrace();
      }

      try (OutputStream out = new FileOutputStream(filePath)){
         //-----------------------
         String data = "n";
         out.write(data.getBytes());
         //-----------------------
      } catch(IOException e) {
         e.printStackTrace();
      }
      
      try(InputStream in = new FileInputStream(filePath)) {
         //-----------------------
            int readByte = in.read();
            System.out.println((char) readByte);
            //-------------
      } catch (IOException e) {
         e.printStackTrace();
      }

      try (FileWriter fw = new FileWriter(filePath,true)){
         fw.append("hi");
         fw.append("jiwon");
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      try {
         BufferedReader br = new BufferedReader(new FileReader(filePath));
          String line = br.readLine();
          while (line != null) {
              System.out.println(line);
              line = br.readLine();
          }
      } catch (IOException e) {
          e.printStackTrace();
      }

   }
}