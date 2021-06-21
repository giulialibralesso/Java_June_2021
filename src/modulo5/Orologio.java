package modulo6;

import java.text.DecimalFormat;

public class Orologio {

	private int ora;
	private int minuti;
	private int secondi;
	
	public Orologio() {
		
		setTime(0, 0, 0);
		
	} //fine metodo costruttore Orologio()
	
	public Orologio(int hour, int minutes) {
		
		setTime(hour, minutes);
		
	}//fine metodo costruttore Orologio(int hour, int minutes)
	
	public Orologio(int hour, int minutes, int seconds) {
		
		setTime(hour, minutes, seconds);
		
	}//fine metodo costruttore Orologio(int hour, int minutes, int seconds)
	
	public void setTime(int h, int m) {
		
		setHour(h);
		setMinutes(m);
		setSeconds(0);
		
	} //fine metodo setTime(int h, int m)
	
	public void setTime(int h, int m, int s) {
		
		setHour(h);
		setMinutes(m);
		setSeconds(s);
		
	} //fine metodo setTime(int h, int m, int s)
	
	private void setHour(int hour) {
		
		ora = ((hour>=0)&&(hour<24)) ? hour : 0;
		
	} //fine metodo setHour(int hour)
	
	private void setMinutes(int minutes) {
		
		minuti = ((minutes>=0)&&(minutes<60) ? minutes : 0);
		
	} //fine metodo setMinutes(int minutes)
	
	private void setSeconds(int seconds) {
		
		secondi = ((seconds>=0)&&(seconds<60) ? seconds : 0);
		
	} //fine metodo setMinutes(int minutes)
	
	private int getHour() {
		
		return ora;
		
	} //fine metodo getHour()
	
	private int getMinutes() {
		
		return minuti;
		
	} //fine metodo getMinutes()
	
	private int getSeconds() {
		
		return secondi;
		
	} //fine metodo getSeconds()
	
	public String getUniversalTime() {
		
		String outputTime;
		
		DecimalFormat dueCifre = new DecimalFormat("00");
		
		outputTime = getHour() +":" +dueCifre.format(getMinutes()) 
		            +":" +dueCifre.format(getSeconds());
		
		return outputTime;
		
	} //fine metodo getUniversalTime()/////////////////////////////////////////////////////
	
	public String getStandardTime() {
		
		String outputTime;
		
		DecimalFormat dueCifre = new DecimalFormat("00");
		
		outputTime = ((getHour()==12)||(getHour()==0) ? 12 : getHour()%12) +":"
				     +dueCifre.format(getMinutes()) +":"
				     +dueCifre.format(getSeconds())
				     +(getHour() < 12 ? " AM" : " PM");
		
		return outputTime;
		
	} //fine metodo getStandardTime()/////////////////////////////////////////////////////
	
} //fine classe orologio
