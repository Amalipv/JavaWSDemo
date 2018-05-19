/**
 *SOAP Web Service Client  
 */
package com.ams.soapclients;

import java.util.Scanner;

import com.thomas_bayer.blz.BLZService;
import com.thomas_bayer.blz.BLZServicePortType;
import com.thomas_bayer.blz.DetailsType;

/**
 * @author 445773
 *
 */
public class BLZServiceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the bank Code for which you want to know the details ");
		Scanner in = new Scanner(System.in);
		String bankCode = in.next();
		if(bankCode != null){
			BLZService blzService = new BLZService();
			BLZServicePortType blzServicePortType = blzService.getBLZServiceSOAP11PortHttp();
			DetailsType detailsType = blzServicePortType.getBank(bankCode);
			System.out.println("Bank Name : "+detailsType.getBezeichnung());
			System.out.println(detailsType.getBic());
			System.out.println(detailsType.getOrt());
			System.out.println(detailsType.getPlz());
		}
	}

}
