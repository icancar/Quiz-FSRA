package quiz;
import  java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Baza_Pitanja {
	
	private static Baza_Pitanja baza=null;

	private List<Question> lista_pitanja =null;
	//private List<Question> lista_pitanja_answerBox=null;

	
	

	public int brojPitanja() {
		return lista_pitanja.size();
	}
	/*public int brojPitanjaAnswerBox() {
		return lista_pitanja_answerBox.size();
	}*/
	
	
	private Baza_Pitanja() {
		lista_pitanja=new ArrayList<Question>();
		//lista_pitanja_answerBox=new ArrayList<Question>();
		
	}
	public static Baza_Pitanja dohvati_bazu() {
		
		if(baza==null) {
			baza=new Baza_Pitanja();
			baza.inic();
			return baza;
		} else return baza;
	}
	
	
	public void dodaj(Question pitanje) {
		lista_pitanja.add(pitanje);
	}
	
	
	public Question dohvati_po_Id(int i) {
		return baza.lista_pitanja.get(i);	
	}
    
	
	
	private void inic() {
		/*
		//PITANJE 1
				List <String> odgovori1=new ArrayList<String>();
				odgovori1.add("The tire change during driver change is not allowed and does not count as time penalty.");
				odgovori1.add("The tire change during driver change is not allowed and the time used for dry tyre change is added to the team's total time.");
				odgovori1.add("The tire change during driver change is allowed and does not count as time penalty.");
				odgovori1.add("The tire change during driver change is allowed and the time used is added to the team's total time.");
				
				Question q1=new RadioButtonQ (new JLabel("The weather Condition during Endurance changes from wet to damp. Which statement is true?"),odgovori1, "The tire change during driver change is allowed and the time used is added to the team's total time.",null, null);
				//lista_pitanja.add(q1);
				
				//PITANJE 2
				List <String> odgovori2=new ArrayList<String>();
				odgovori2.add("Launch of the first successful American satelite (Explorer 1)");
				odgovori2.add("Launch of the Apollo 14 Mission");
				odgovori2.add("The Soviet Union launches the unmanned Luna 9 spacecraft");
				odgovori2.add("Launch of the Vostok 6 (first spaceflight for a woman)");
				Question q2=new RadioButtonQ (new JLabel("Which of the following events did NOT happen on this day (Jan 31st)?"),odgovori2, "The Soviet Union launches the unmanned Luna 9 spacecraft",null, null);
				//lista_pitanja.add(q2);
				
				//PITANJE 3
				List <String>odgovori3=new ArrayList<String>();
				odgovori3.add("Pr number");
				odgovori3.add("Re number");
				odgovori3.add("Nu number");
				odgovori3.add("Gr number");
				Question q3=new RadioButtonQ (new JLabel("Which of the following dimensionless quantities is independent of the flow parameters and depend only on the fluid and the fluid state?"),odgovori3, "Nu number",null, null);
				//lista_pitanja.add(q3);
				
				//PITANJE 4
				List <String> odgovori4=new ArrayList<String>();
				odgovori4.add("sayori");
				odgovori4.add("shinchaku");
				odgovori4.add("seiketsu");
				odgovori4.add("shikishima");
				Question q4=new RadioButtonQ (new JLabel("Which of the following expressions is part of the 5S methodology?"),odgovori4, "sayori",null, null);
				//lista_pitanja.add(q4);
				
			/*	//PITANJE 5
				List <String> odgovori5=new ArrayList<String>();
				odgovori5.add("35,21 km/h");
				odgovori5.add("29,02 km/h");
				odgovori5.add("31,46 km/h");
				odgovori5.add("26,64 km/h");
				Question q5=new RadioButtonQ (new JLabel("<html>During an impact, the front section of your chassis has to absorb an energy of 13.690J.<br/> The over all weight of your car is 268kg, the length of the impact attenuator is 250mm, height 100mm and a width of 200mm. Calculate the impact speed (km/h).</html>"),odgovori5, "31,46 km/h",null, null);
				lista_pitanja.add(q5);
				
				//PITANJE 6
				List <String> odgovori6=new ArrayList<String>();
				odgovori6.add("Time= 5 sec, Acceleration=  6 m/sec2");
				odgovori6.add("Time= 1 sec, Acceleration= 7 m/sec2");
				odgovori6.add("Time= 5,65 sec, Acceleration=  5,84 m/sec2");
				odgovori6.add("Time= 5 min, Acceleration= 6 km/h2");
				Question q6=new RadioButtonQ (new JLabel("<html>The length of the acceleration track is 75 meters. Hypothetically the acceleration of the cars is constant and linear, without slip.<br/> The vehicle starts from the starting line of the Acceleration track and then covers 75 meters. At the finish line, the speed of the racecar is 108 km/h.<br/> How much time it is needed for the car to complete the Acceleration Event and what was the acceleration of the car?</html>"),odgovori6, "Time= 5 min, Acceleration= 6 km/h2",null, null);
				lista_pitanja.add(q6);
				
				//PITANJE 7
				List <String> odgovori7=new ArrayList<String>();
				odgovori7.add("A 690 cc turbocharged single-cylinder engine with a plenum downstream of the throttle body.");
				odgovori7.add("A 600 cc four cylinder engine with a flexible restrictor in the intake system.");
				odgovori7.add("A 1750 cc turbocharged and supercharged engine with an intercooler.");
				odgovori7.add("A 500cc two-cylinder engine with two-stage turbocharging and an intercooler between the stages.");
				Question q7=new RadioButtonQ (new JLabel("A team is choosing an engine for their current FS season. Which of the following is allowed by the rules?"),odgovori7, "A 600 cc four cylinder engine with a flexible restrictor in the intake system.",null, null);
				lista_pitanja.add(q7);
				
				//PITANJE 8
				List <String> odgovori8=new ArrayList<String>();
				odgovori8.add("There is no problem, every second lap will be measured, like a normal skipad session.");
				odgovori8.add("The result of the run is a DNF.");
				odgovori8.add("0.2 second time penalty will be added to the measured skipad time.");
				odgovori8.add("If this 3rd left circle is faster than the second left circle, the 3rd circle time will be counted.");
				Question q8=new RadioButtonQ (new JLabel("<html>Imagine that there is a Skipad session. One of the drivers runs a full - skipad scene, but at the end, <br/>the driver forgets to end the session and runs a 3rd left circle instead of the normally 2 circles. What will be the result of this full - skipad run?</html>"),odgovori8, "There is no problem, every second lap will be measured, like a normal skipad session.",null, null);
				lista_pitanja.add(q8);
				
				//PITANJE 9
				List <String> odgovori9=new ArrayList<String>();
				odgovori9.add("A 20 cm long LED strip.");
				odgovori9.add("A 6 cm wide and 3 cm high rectangle.");
				odgovori9.add("A triangle with 6 cm base and 4.5 cm of height.");
				odgovori9.add("A near round shape with the diameter of 5 cm.");
				Question q9=new RadioButtonQ (new JLabel("Which brake light cannot be used, assuming that the whole area is illuminated with even luminous intensity?"),odgovori9, "A 20 cm long LED strip.",null, null);
				lista_pitanja.add(q9);
				
				//PITANJE 10
				List <String> odgovori10=new ArrayList<String>();
				odgovori10.add("Teams are allowed to bring laptops and tablets beside handwritten, or printed handouts to the event.");
				odgovori10.add("Cover and/or parts must be removed before judging to facilitate access and presentation of components or concepts.");
				odgovori10.add("The teams may present their vehicle at the designated time to the judges. Teams that miss their time slot can present their vehicle at the end of the day to the judges.");
				odgovori10.add("Vehicles must be presented for cost and manufacturing judging in finished condition, fully assembled, complete, ready-to-race condition, with its dry or wet tires mounted.");
				Question q10=new RadioButtonQ (new JLabel("Which statement is true for the Cost and Manufacturing Event?"),odgovori10, "Vehicles must be presented for cost and manufacturing judging in finished condition, fully assembled, complete, ready-to-race condition, with its dry or wet tires mounted.",null, null);
				lista_pitanja.add(q10);
				
				//PITANJE 11
				List <String> odgovori11=new ArrayList<String>();
				odgovori11.add("Inconsistency");
				odgovori11.add("Design out overburden");
				odgovori11.add("Eliminate waste");
				odgovori11.add("Transportation cost cut");
				Question q11=new RadioButtonQ (new JLabel("What is not the main objective of the TPS?"),odgovori11, "Inconsistency",null, null);
				lista_pitanja.add(q11);
				
				//PITANJE 12
				List <String> odgovori12=new ArrayList<String>();
				odgovori12.add("15.04");
				odgovori12.add("14.03");
				odgovori12.add("13.05");
				odgovori12.add("15.67");
				Question q12=new RadioButtonQ (new JLabel("<html>Your are using a 2007 Kawasaki zx6r engine for your FS car. This engine comes with engine displacement of 599 cc, a bore of 67mm,<br/> a stroke of 42,5mm and a compression ratio of 12,0.<br/> You make the following modifications on this engine:<br/> 1) machining crankcase -0.35mm,<br/> 2) piston head offset +0.15mm,<br/> 3) cylinder head gasket -0.10mm.<br/>What will be new compression ratio after the modifications?<br/> (round all numbers on two decimal points)</html>"),odgovori12, "15.04",null, null);
				lista_pitanja.add(q12);
				
				//23.11.2020 pitanja uzeta sa FS Czech
				//PITANJE 13
				List <String> odgovori13=new ArrayList<String>();
				odgovori13.add("1.64 bar");
				odgovori13.add("1.58 bar");
				odgovori13.add("1.52 bar");
				odgovori13.add("1.32 bar");
				Question q13=new RadioButtonQ (new JLabel("A team wants their tyres to be at 1.8bar when they reach 85 degrees Celsius, but pits are at 30 degrees Celsius, <br/>assuming Ideal Gas, at what pressure should they inflate the tyres?"),odgovori13, "1.64 bar",null, null);
				lista_pitanja.add(q13);
				
				//PITANJE 14
				List <String> odgovori14=new ArrayList<String>();
				odgovori14.add("10 bar.");
				odgovori14.add("11 bar.");
				odgovori14.add("12 bar.");
				odgovori14.add("13 bar.");
				Question q14=new RadioButtonQ (new JLabel("How high is brake mean effective pressure of firing cylinders in Ford Fiesta ST engine following condition? <br/>3 cylinder engine with bore 84mm and stroke 90mm. Engine is producing 35kW at 3500RPM in cylinder deactivated mode."),odgovori14, "12 bar.",null, null);
				lista_pitanja.add(q14);
				
				//PITANJE 15
				List <String> odgovori15=new ArrayList<String>();
				odgovori15.add("Decreasing turbulence intensity in the direction perpendicular to the flow.");
				odgovori15.add("Decreasing turbulence intensity in the direction of the flow.");
				odgovori15.add("Increasing turbulence intensity in the direction perpendicular to the flow.");
				odgovori15.add("Increasing turbulence intensity in the direction of the flow.");
				Question q15=new RadioButtonQ (new JLabel("What is purpose of the honeycomb in a wind tunnel?"),odgovori15, "Decreasing turbulence intensity in the direction perpendicular to the flow.",null, null);
				lista_pitanja.add(q15);
				
				//PITANJE 16
				List <String> odgovori16=new ArrayList<String>();
				odgovori16.add("-0.5 < v < 0.5");
				odgovori16.add("-1 < v < 0.5");
				odgovori16.add("0 < v < 1");
				odgovori16.add("0 < v < 0.5");
				Question q16=new RadioButtonQ (new JLabel("Isotropic material must have Poisson's ratio in range"),odgovori16, "Inconsistency",null, null);
				lista_pitanja.add(q16);
				
				//PITANJE 17
				List <String> odgovori17=new ArrayList<String>();
				odgovori17.add("Not restricted and tyre set choice is based on track condition.");
				odgovori17.add("Only one set of tires per type(dry/wet) may be used during all the dynamic events. The brake test, practice area and the static events are included from this regulation.");
				odgovori17.add("Only one set of tires per type(dry/wet) may be used during all the dynamic events. The brake test, practice area and the static events are excluded in this regulation.");
				odgovori17.add("Restricted by the event (specified in the Handbook).");
				Question q17=new RadioButtonQ (new JLabel("How many sets of tyres are allowed to be used during all dynamic events"),odgovori17, "Restricted by the event (specified in the Handbook).",null, null);
				lista_pitanja.add(q17);
				
				//PITANJE 18
				List <String> odgovori18=new ArrayList<String>();
				odgovori18.add("Steering wheel angle over lateral acceleration and gradient of steering wheel angle over lateral acceleration.");
				odgovori18.add("Car side slip angle over lateral acceleration and gradient of side slip angle over lateral acceleration.");
				odgovori18.add("Car roll angle over lateral acceleration and gradient of roll angle over lateral acceleration.");
				odgovori18.add("Car pitch angle over lateral acceleration and gradient of pitch angle over lateral acceleration.");
				Question q18=new RadioButtonQ (new JLabel("What criteria is most suitable for evaluation of the rear axle behavior"),odgovori18, "Steering wheel angle over lateral acceleration and gradient of steering wheel angle over lateral acceleration.",null, null);
				lista_pitanja.add(q18);
				
				//PITANJE 19
				List <String> odgovori19=new ArrayList<String>();
				odgovori19.add("1200 MPa");
				odgovori19.add("1210 MPa");
				odgovori19.add("1220 MPa");
				odgovori19.add("1290 MPa");
				Question q19=new RadioButtonQ (new JLabel("What is the minimal tensile strength of the 12.9 bolt acc to the ISO4162?"),odgovori19, "1200 MPa",null, null);
				lista_pitanja.add(q19);
				
				//PITANJE 20
				List <String> odgovori20=new ArrayList<String>();
				odgovori20.add("72,63");
				odgovori20.add("75");
				odgovori20.add("69,73");
				odgovori20.add("74,35");
				Question q20=new RadioButtonQ (new JLabel("<html>On the Cost and Manufacturing Event there are only two finalists, the higest Score Awarded to the best team participating in the finals is 98 points.<br/> The Score Awarded to the third place is 92 points and your Cost Score team is 75 points. What is Score Awarded of your team?</html>"),odgovori20, "72,63",null, null);
				lista_pitanja.add(q20);
				
				//PITANJE 21
				List <String> odgovori21=new ArrayList<String>();
				odgovori21.add("41,95mm");
				odgovori21.add("42,10mm");
				odgovori21.add("41,99mm");
				odgovori21.add("42,00mm");
				Question q21=new RadioButtonQ (new JLabel("<html>The quality department of our team is measuring four shafts, form four different suppliers with the following requirements Diam=42h10 mm (ISO286-1988).<br/> Which of these shafts is not valid according to our specifications?</html>"),odgovori21, "41,95mm",null, null);
				lista_pitanja.add(q21);
				
				//PITANJE 22
				List <String> odgovori22=new ArrayList<String>();
				odgovori22.add("115db(C)");
				odgovori22.add("90db(A)");
				odgovori22.add("110db(C)");
				odgovori22.add("103db(C)");
				Question q22=new RadioButtonQ (new JLabel("At idle position, which is the maximum permitted sound level dB(C)?"),odgovori22, "115db(C)",null, null);
				lista_pitanja.add(q22);
				
				//PITANJE 23
				List <String> odgovori23=new ArrayList<String>();
				odgovori23.add("4300 ohm (+/- 1%)");
				odgovori23.add("430 ohm (+/- 1%)");
				odgovori23.add("3400 ohm (+/- 2%)");
				odgovori23.add("3400 ohm (+/- 2%)");
				Question q23=new RadioButtonQ (new JLabel("What is not the main objective of the TPS?"),odgovori23, "4300 ohm (+/- 1%)",null, null);
				lista_pitanja.add(q23);
				
				//PITANJE 24
				List <String> odgovori24=new ArrayList<String>();
				odgovori24.add("83,60");
				odgovori24.add("82,90");
				odgovori24.add("84,13");
				odgovori24.add("All answers are wrong");
				Question q24=new RadioButtonQ (new JLabel("<html>Time keeping has registered an uncorrected elapsed driving time of t=24,30 min for the fastest endurance vehicla and it knocked 7 cones (DOO).<br/> The lowes corrected used fuel volume of all teams who are able to score points in efficiency is V=3,10L (98RON).<br/> Our team has an endurance uncorrected elapsed driving time of t=28,20 min and we made 1 off-course (OC).<br/>Our corrected used fuel volume is V=3.54L (98RON). The best efficiency team has an efficiency factor of E=0,85 and the worst efficiency team has an efficiency factor of E=0,48. <br/>Which is our Efficiency Score?</html>"),odgovori24, "83,60",null, null);
				lista_pitanja.add(q24);
				
				//PITANJE 25
				List <String> odgovori25=new ArrayList<String>();
				odgovori25.add("Aluminum (width=40mm/thickness=3mm)");
				odgovori25.add("Steel (width=38mm/thickness=3mm)");
				odgovori25.add("Steel (width=25mm/thickness=2mm)");
				odgovori25.add("Aluminum (width=36mm/thickness=4mm)");
				Question q25=new RadioButtonQ (new JLabel("<html>Our transmission system uses a chain to transmit the power from the gearbox to the rear axis. The chain used has a width (w=12mm).<br/>Which of the following requirements is not allowed to use as an scatter shield?</html>"),odgovori25, "Aluminum (width=40mm/thickness=3mm)",null, null);
				lista_pitanja.add(q25);
				
				//PITANJE 26
				List <String> odgovori26=new ArrayList<String>();
				odgovori26.add("177 min/car");
				odgovori26.add("0,34 cars/h");
				odgovori26.add("1,36 cars/h");
				odgovori26.add("44,25 min/car");
				Question q26=new RadioButtonQ (new JLabel("<html>40 CV teams will participate on FSS20 edition. The technical inspection will be open on Tuesday (11:00h-19:00h), <br/>Wednesday (09:00h-19:00h) and Thursday (09:00h-20:30h). We can do the technical inspection of 4 cars at the same time. Which is the takt time?</html>"),odgovori26, "177 min/car",null, null);
				lista_pitanja.add(q26);
				
				//PITANJE 27
				List <String> odgovori27=new ArrayList<String>();
				odgovori27.add("70,74");
				odgovori27.add("65,13");
				odgovori27.add("76,49");
				odgovori27.add("69,50");
				Question q27=new RadioButtonQ (new JLabel("<html>Time keeping has registered a total time of t=22,25min for the fastest endurance vehicle. but it knocked 5 cones (DOO). <br/>Our team has a total time of t=27,50 min but we knocked 6 cones (DOO) and we did 1 off-course (OC). \n What is our Endurance score?</html>"),odgovori27, "70,74",null, null);
				lista_pitanja.add(q27);
				
				//PITANJE 28
				List <String> odgovori28=new ArrayList<String>();
				odgovori28.add("14.137 kW");
				odgovori28.add("21.206 kW");
				odgovori28.add("28.274 kW");
				odgovori28.add("56.548 kW");
				Question q28=new RadioButtonQ (new JLabel("<html>A two cylinder four-stroke engine works on a mean effective pressure of 5 bar  and engine speed of 6000 rpm.<br/> Find the indicated power developed by the engine if the bore is 60mm and the stroke is 100mm?</html>"),odgovori27, "14.137 kW",null, null);
				lista_pitanja.add(q28);
				
				//odavde krecu pitanja sa answer boxom
				//PITANJE 29
				Question q29=new AnswerBoxQ(new JLabel("<html>Your car loses a wheel while you are going 72 km/h and dthe wheel continues \nrolling straight ahead for 40m with a rolling resistance of 10N before it reaches the press area. <br/> How fast is the tire going at that point? (in m/s, rounded to full number)  Wheel data: 16.2\" outer diameter, mass=5kg, rotational intertia lyy=0.093 Kgm na kvadrat <br/> ***PLEASE use the following format: 12.34</html>"),null,"10.10",null, null);
				lista_pitanja.add(q29);
				
				//PITANJE 30
				Question q30=new AnswerBoxQ(new JLabel("<html>Calculate the maximum possible cornering speed for the following FSAE car when going thru a 20m radius corner (in kph).<br/> Overall mass=260kg. Product of coefficient of lift, frontal area and air density (cl * A * ROH)=-6kg/m; Tire coefficient of friction=1.5. Gravity acc. g=9.81. <br/>(Hint: the vehicle can be trated as a point mass, driving resistances neglected); Round to 1 decimal.<br/> ***PLEASE use the following formalt:12.34</html>"),null,"10.10",null, null);
				lista_pitanja.add(q30);
				
				//PITANJE 31
				Question q31=new AnswerBoxQ(new JLabel("<html>At the \"no help zone\" line on the acceleration is a ditch that is 15mm deep and wide enough for your 13\" outer diameter tire to completely reach the bottom.<br/> The surrounding surface is flat and level. Your wheelbase is as short as possible and when front wing is built to the maximum dimensions as allowed in the Rules.<br/> You are rolling slowly so you can assume your suspension to be stiff. What's the minimum ground clearance (in mm) that remains while driving across that ditch?</html>"),null,"10.10",null, null);
				lista_pitanja.add(q31);
				
				//PITANJE 32
				Question q32=new AnswerBoxQ(new JLabel("<html>A sinusoid signal gets sampled by an analoge to digital converter. The frequency of the analoge sine wave is 340HZ, the sampling frequency is 300Hz.<br/> What is the requency of the samplet signal? Enter the solution in Hertz and round to whole numbers.</html>"),null,"10.10", null, null);
				lista_pitanja.add(q32);
				
				//PITANJE 33
				Question q33=new AnswerBoxQ(new JLabel("<html>What is dissipating heat energy per hour of a cooling system of an accumulator unit in an EV vehicle when the coolant surrounding the accumulator heats up to 56 degrees Celsius,<br/>the cooling water (c-4.19kJ/kgK) circulates with 16kg / min and the cooler has an outlet temperature of 41 degrees Celsius.<br/>(assume the lines as lossless)? Enter the solution in kJ/h and round to whole numbers.</html>"),null,"10.10",null, null);
				lista_pitanja.add(q33);
				
				//PITANJE 34
				Question q34=new AnswerBoxQ(new JLabel("For a pneumatic actuated brake system a team is using a pressure bottle with an relative pressure of 180 bar with respect to the atmosphere and a total inner volume of 1.2 litre.<br/>Consider a portion of the gas, which at 1bar absolut atmospheric pressure would fill a volume of 0.002m cube is missing in the bottle.<br/> What would be the new relative pressure with respect to the atmosphere in the bottle? Enter the solution in bar and round solution to one decimal place.</html>"),null,"10.10",null, null);
				lista_pitanja.add(q34);
				
				//PITANJE 35
				Question q35=new AnswerBoxQ(new JLabel("Your front hoop bracing member consists of a round straight tube made out of baseline material with the dimension 25.4mm outer diameter and 1.6 mm wall thickness and<br/> a total length of 1135mm. What is the percent increase of the bending stiffness (defined as EI) if you use a round straight closed section tube with the dimension 33mm outer diameter<br/> and 1.3mm wall thickness. Round solution to one decimal place. How much percent increase the weight for this tube? [r=7.874 g/cm3] Round solution to one decimal place.<br/> Give your answer in the following format: stiffness inc, weight inc. Example: if the stiffness increase is 45,6% and the weight increase is 23.4% then use 45.6, 23.4 as an answer value.</html>"),null,"10.10", null, null);
				lista_pitanja.add(q35);
				*//*
				//2014 godina Austria
				//PITANJE 36 -
				List <String> odgovori36=new ArrayList<String>();
				odgovori36.add("120mm wide, 2mm thick, steel");
				odgovori36.add("100mm wide, 5mm thick, steel");
				odgovori36.add("120mm wide, 4mm thick, aluminum");
				odgovori36.add("120mm wide, 3mm thick, steel");
				Question q36=new RadioButtonQ (new JLabel("Which of the following materials is acceptable as scatter shiel for a chain with a maxiumum width of 38mm?"),odgovori36, "120mm wide, 2mm thick, steel", null, null);
				lista_pitanja.add(q36);
				
				//PITANJE 37 -
				List <String> odgovori37=new ArrayList<String>();
				odgovori37.add("All events are run separately but scored together.");
				odgovori37.add("All events are scored completely separate.");
				odgovori37.add("Only the dynamic events are scored separately.");
				odgovori37.add("At FSA, all vehicles are run and scored together.");
				Question q37=new RadioButtonQ (new JLabel("IC and EV scoring at FSA: which is true?"),odgovori37, "Only the dynamic events are scored separately.", null, null);
				lista_pitanja.add(q37);
				
				//PITANJE 38 -
				List <String> odgovori38=new ArrayList<String>();
				odgovori38.add("Mass Flow Sensor Signal");
				odgovori38.add("Wideband Lambda Signal");
				odgovori38.add("Manifold Pressure");
				odgovori38.add("Throttle Position");
				Question q38=new RadioButtonQ (new JLabel("In an n-alpha type engine control system, the primary load parameter is"),odgovori38, "Throttle Position", null, null);
				//lista_pitanja.add(q38);
				
				//PITANJE 39 - 
				List <String> odgovori39=new ArrayList<String>();
				odgovori39.add("A single drain hole, at least 30mm in diameter");
				odgovori39.add("A signle drain hole, with no specific size");
				odgovori39.add("2 drain holes, at least 25mm in diameter");
				odgovori39.add("2 drain holes, at least 25,4mm in diameter");
				Question q39=new RadioButtonQ (new JLabel("To prevent fuel and other liquids from pooling in closed structures of your car, it has to feature:"),odgovori39, "2 drain holes, at least 25mm in diameter", null, null);
				//lista_pitanja.add(q39);
				
				//PITANJE 40 -
				List <String> odgovori40=new ArrayList<String>();
				odgovori40.add("Fire extinguishers");
				odgovori40.add("smooth tread (slick) tires");
				odgovori40.add("Vehicle stands");
				odgovori40.add("All of these");
				Question q40=new RadioButtonQ (new JLabel("What has to be brought to Technical inspecition?"),odgovori40, "Fire extinguishers", null, null);
				lista_pitanja.add(q40);
				
				//PITANJE 41 -
				List <String> odgovori41=new ArrayList<String>();
				odgovori41.add("1387g");
				odgovori41.add("1208g");
				odgovori41.add("1443g");
				odgovori41.add("1361g");
				Question q41=new RadioButtonQ (new JLabel("What is minimum weight of a rules compliant man hoop tube of 1m length (density of steel 7,85 g/cm3)?"),odgovori41, "1387g", null, null);
				//lista_pitanja.add(q41);
				
				//PITANJE 42 -
				List <String> odgovori42=new ArrayList<String>();
				odgovori42.add("Lateral acceleration, track width, CoG height");
				odgovori42.add("Lateral acceleration, track width");
				odgovori42.add("Lateral acceleration, wheel base, CoG height");
				odgovori42.add("Lateral acceleration, track width, CoG height, vehicle mass");
				odgovori42.add("Lateral acceleration, wheel base, CoG height, vehicle mass");
				Question q42=new RadioButtonQ (new JLabel("The 'weight transfer' (in N) during cornering is dependent on:"),odgovori42, "Lateral acceleration, track width, CoG height, vehicle mass", null, null);
				lista_pitanja.add(q42);
				
				//PITANJE 43   -nema odgovor jos uvijek
				List <String> odgovori43=new ArrayList<String>();
				odgovori43.add("Rich spikes, because of the unburnt fuel");
				odgovori43.add("Lean spikes, because of the air introduced");
				odgovori43.add("It will display an error");
				odgovori43.add("Nothing unusual, since the air to fuel ratio does not change");
				Question q43=new RadioButtonQ (new JLabel("The ignition system on your engine is faulty, so there are occasional misfires (missing spark). What will your DAQ system record on the wideband lambda input?"),odgovori43, "Rich spikes, because of the unburnt fuel", null, null);
				//lista_pitanja.add(q43);
				
				//PITANJE 44 -
				List <String> odgovori44=new ArrayList<String>();
				odgovori44.add("In the EBOM file next to the table describing the part");
				odgovori44.add("In a separate file");
				odgovori44.add("The supporting material is included in the standard cost tables");
				odgovori44.add("Supporting material should not be submitted, just presented at the visual inspection");
				Question q44=new RadioButtonQ (new JLabel("When submitting the cost report, where do drawings and other supporting material go?"),odgovori44, "In a separate file", null, null);
				lista_pitanja.add(q44);
				
				//PITANJE 45 -
				List <String> odgovori45=new ArrayList<String>();
				odgovori45.add("26mm");
				odgovori45.add("52mm");
				odgovori45.add("78mm");
				odgovori45.add("not regulated");
				Question q45=new RadioButtonQ (new JLabel("What is the minimum radius a man hoop tube can be bent (measured at tube centerline) if the ouside diameter is 26mm?"),odgovori45, "78mm", null, null);
				lista_pitanja.add(q45);
				
				//PITANJE 46 -
				List <String> odgovori46=new ArrayList<String>();
				odgovori46.add("This is illegal");
				odgovori46.add("This is allowed");
				odgovori46.add("You have to have brake caliper fasteners checked by a scrutineer after changing");
				odgovori46.add("You have to redo the brake test (re-scrutineer)");
				Question q46=new RadioButtonQ (new JLabel("Your Brake pads are already worn out after the AutoX and you change to pads with a harder compound."),odgovori46, "This is illegal", null, null);
				lista_pitanja.add(q46);
				
				//Ceska 2014
				//PITANJE 47 -
				List <String> odgovori47=new ArrayList<String>();
				odgovori47.add("The top 180 degrees of the wheels/tires must be unobstructed when viewed 68.6mm (2.7 inches) above the horizontal plane formed by the top of the front tires.");
				odgovori47.add("<html>No part of the vehicle may enter a keep-out-zone defined as a circle 68.6mm (2.7 inches) larger radially than the ouside diameter of the tire with the tires steered straight<br/> ahead woth a 87kg (170 pound) driver seated in the normal driving position. The inner sidewall of the tire (vehicle side) is not included in this assessment.</html>");
				odgovori47.add("The top 180 degrees of the wheels/tires must be unobstructed when viewed 68.6mm (2.7 inches) above the plane formed by the tops of the front and rear tires.");
				Question q47=new RadioButtonQ (new JLabel("Open Wheel vehicles must satisfy:"),odgovori47, "<html>No part of the vehicle may enter a keep-out-zone defined as a circle 68.6mm (2.7 inches) larger radially than the ouside diameter of the tire with the tires steered straight<br/> ahead woth a 87kg (170 pound) driver seated in the normal driving position. The inner sidewall of the tire (vehicle side) is not included in this assessment.</html>", null, null);
				lista_pitanja.add(q47);
				
				//PITANJE 48 -
				List <String> odgovori48=new ArrayList<String>();
				odgovori48.add("Have a minimum area of 235 sq. cms (36sq. ins) and have a minimum height adjustment of 17.5 cms (7 inches), or have a minimum height of 28 cms (11 inches).");
				odgovori48.add("Have a minimum area of 235 sq. cms (36sq. ins) and have a minimum height adjustment of 28 cms (11 inches), or have a minimum height of 17.5 cms (7 inches).");
				odgovori48.add("Have a minimum area of 226 sq. cms (35sq. ins) and have a minimum height adjustment of 17.5 cms (7 inches), or have a minimum height of 28 cms (11 inches).");
				Question q48=new RadioButtonQ (new JLabel("A head resistant must:"),odgovori48, "Have a minimum area of 235 sq. cms (36sq. ins) and have a minimum height adjustment of 17.5 cms (7 inches), or have a minimum height of 28 cms (11 inches).", null, null);
				lista_pitanja.add(q48);
				
				//PITANJE 49 -
				List <String> odgovori49=new ArrayList<String>();
				odgovori49.add("Tube 25.4 x 1.5mm (1 x 0.0591 in)");
				odgovori49.add("Square 25.4 x 25.4 x 1.6 mm (1 x 1 x 0.063 in)");
				odgovori49.add("Tube 30 x 2mm (1.181 x 0.0787 in)");
				Question q49=new RadioButtonQ (new JLabel("What profile has the best (highest) bending stiffness/mass ratio (consider same material for all)?"),odgovori47, "Tube 30 x 2mm (1.181 x 0.0787 in)", null, null);
				//lista_pitanja.add(q49);
				
				//PITANJE 50 -
				List <String> odgovori50=new ArrayList<String>();
				odgovori50.add("360.4N");
				odgovori50.add("364.5N");
				odgovori50.add("356.2N");
				Question q50=new RadioButtonQ (new JLabel("What will be the downforce of a rear wing with area 1.4m^2 (2170in^2), downforce coefficient 1.42, operating at 25 deg. C, atmosperic pressure 101.325kPa and dry air velocity 63kph."),odgovori50, "360.4N", null, null);
				//lista_pitanja.add(q50);
				
				//PITANJE 51 - nije poslat konacan odgovor
				List <String> odgovori51=new ArrayList<String>();
				odgovori51.add("254 g/kWh");
				odgovori51.add("268 g/kWh");
				odgovori51.add("273 g/kWh");
				Question q51=new RadioButtonQ (new JLabel("What is the brake specific fuel consumption of 4 stroke 2 cylinder engine with bore 83mm and stroke 42mm. Engine power is defined by the 13.5bar of brake mean effective <br/>pressure at 7600RPM. Engine is running on the unleaded gasoline with density 740kg/m3 and octane number 98. Actual lambda value at defined load point is 0.96 and <br/>stochiometric ratio of the used fuel is 14.12. Engine is running at following barometric conditions: barometric pressure 980mbar, temperature 24 degC.<br/> Volumetric efficiency defined to the atmospheric conditions was 1.06.</html>"),odgovori51, "254 g/kWh", null, null);
				//lista_pitanja.add(q51);
				
				//Nemacka 2014
				//PITANJE 52 -
				List <String> odgovori52=new ArrayList<String>();
				odgovori52.add("Halon extinguishers");
				odgovori52.add("dry chemical/dry powder");
				odgovori52.add("High pressure water cannons");
				odgovori52.add("Aqueous Film Forming Foam (AFFF) extinguishers");
				Question q52=new RadioButtonQ (new JLabel("What kind of Fire Extinguishers are allowed to be used at FSG?"),odgovori52, "dry chemical/dry powder", null, null);
				lista_pitanja.add(q52);
				
				//PITANJE 53 -
				List <String> odgovori53=new ArrayList<String>();
				odgovori53.add("Sun glasses");
				odgovori53.add("If using electrical machines -> wear ear protection!");
				odgovori53.add("Work gloves");
				odgovori53.add("A cap");
				Question q53=new RadioButtonQ (new JLabel("If you work on the car, which safety gear is required?"),odgovori53, "If using electrical machines -> wear ear protection!", null, null);
				lista_pitanja.add(q53);
				
				//PITANJE 54 //AUSTRIA 20219 SAMO OVO PITANJE -
				List <String> odgovori54=new ArrayList<String>();
				odgovori54.add("It is sufficient to have passed mechanical inspection");
				odgovori54.add("All driven wheels must be removed");
				odgovori54.add("You need the supervision of a staff member");
				odgovori54.add("All wheels must be removed");
				Question q54=new RadioButtonQ (new JLabel("Which of these is true regarding cranking your engine in the pit?"),odgovori54, "All driven wheels must be removed", null, null);
				lista_pitanja.add(q54);
				
				//PITANJE 55 -
				List <String> odgovori55=new ArrayList<String>();
				odgovori55.add("minimum 6.5 minutes");
				odgovori55.add("maximum 0.0833 hours");
				odgovori55.add("maximum 240 seconds");
				odgovori55.add("Until the car breaks down");
				Question q55=new RadioButtonQ (new JLabel("What is the regular testing time per slot for each team on the practice area?"),odgovori55, "maximum 0.0833 hours", null, null);
				//lista_pitanja.add(q55);
				
				//PITANJE 56 -
				List <String> odgovori56=new ArrayList<String>();
				odgovori56.add("Next to the fuel station");
				odgovori56.add("At the recreation area opposite the pits.");
				odgovori56.add("There is no medical center at Hockenheimring. You have to drive to the hospital in Schwetzingen");
				odgovori56.add("In Sachs-Haus next to event control");
				Question q56=new RadioButtonQ (new JLabel("Where is the 24/7 medical center at the Hockenheimring locaterd?"),odgovori56, "At the recreation area opposite the pits.", null, null);
			//	lista_pitanja.add(q56);
				
				//PITANJE 57 -
				List <String> odgovori57=new ArrayList<String>();
				odgovori57.add("Only the faculty advisor.");
				odgovori57.add("The faculty advisor and all drivers.");
				odgovori57.add("All team members.");
				odgovori57.add("The team captain and the drivers who want to drive at the respective day.");
				Question q57=new RadioButtonQ (new JLabel("Who must attend the driver briefing every morning?"),odgovori57, "The team captain and the drivers who want to drive at the respective day.", null, null);
				lista_pitanja.add(q57);
				
				//PITANJE 58 -
				List <String> odgovori58=new ArrayList<String>();
				odgovori58.add("The car will be blocked from participating in the event for the following day by the officials.");
				odgovori58.add("The entire team will be disqualified from participating in the event immidiately.");
				odgovori58.add("The faculty advisor has to pay a fee of 500 Euro.");
				odgovori58.add("Only the respective team member will be immediately disqualified for the rest of the event.");
				Question q58=new RadioButtonQ (new JLabel("What will happen if a second team member of a team is caught with an alcohol level above 0.0 on the events site?"),odgovori58, "The entire team will be disqualified from participating in the event immidiately.", null, null);
				//lista_pitanja.add(q58);
				
				//PITANJE 59 -
				List <String> odgovori59=new ArrayList<String>();
				odgovori59.add("The faculty advisor and all safety responisbles must always be with the car.");
				odgovori59.add("A driver with regular clothing may sit in the cockpit.");
				odgovori59.add("A set of two fire extinguishers must always be with the car, mounted to the left and right side of the main roll hoop.");
				odgovori59.add("The vehicle must be pushed at a normal walking pace by using a push bar.");
				Question q59=new RadioButtonQ (new JLabel("Which rule is applicable for moving the car at the event area?"),odgovori59, "The vehicle must be pushed at a normal walking pace by using a push bar.", null, null);
				lista_pitanja.add(q59);
				
				//PITANJE 60 //NIJE SA OVOG TAKMICENJA
				ImageIcon slika18icon=new ImageIcon("sources/slika18.png");
				JLabel slika18=new JLabel(slika18icon);
				List <String> odgovori60=new ArrayList<String>();
				odgovori60.add("Z3 = 450 teeth");
				odgovori60.add("Z3 = 64 teeth");
				odgovori60.add("Z3 = 18 teeth");
				odgovori60.add("In simple gear trains, gears between input and output gears do not change the speed ratio. Z3 can be any value.");
				Question q60=new RadioButtonQ (new JLabel(""),odgovori60, "Z3 = 450 teeth", slika18, null);
				lista_pitanja.add(q60);
				
				//PITANJE 61 -
				List <String> odgovori61=new ArrayList<String>();
				odgovori61.add("115");
				odgovori61.add("0049 176 24316875");
				odgovori61.add("112");
				odgovori61.add("0620 59500");
				Question q61=new RadioButtonQ (new JLabel("What is the emergency number in Germany?"),odgovori61, "112", null, null);
				lista_pitanja.add(q61);
				
				//PITANJE 62  -
				List <String> odgovori62=new ArrayList<String>();
				odgovori62.add("Just at the entrance of the dynamic area.");
				odgovori62.add("Only at the campsite.");
				odgovori62.add("Alongside the pits and inside Event Control.");
				odgovori62.add("A place between event control and BW tower.");
				Question q62=new RadioButtonQ (new JLabel("At which location on the FSG site is smoking permitted?"),odgovori62, "Alongside the pits and inside Event Control.", null, null);
				lista_pitanja.add(q62);
				
				//PITANJE 63 -
				List <String> odgovori63=new ArrayList<String>();
				odgovori63.add("The car directly have another attempt");
				odgovori63.add("The car must be taken to the pits to repair/adjust the brake system");
				odgovori63.add("The team must swap a driver");
				odgovori63.add("The car must proceed to technical inspection for a thorough brake system check");
				Question q63=new RadioButtonQ (new JLabel("What will happen if a car is unable to pass the brake test in three consecutive attepmts?"),odgovori63, "The car directly have another attempt", null, null);
				lista_pitanja.add(q63);
				
				//PITANJE 64 - Nemacka 2015 -
				List <String> odgovori64=new ArrayList<String>();
				odgovori64.add("Waiting with 4 team members");
				odgovori64.add("Parking the car in front of the scrutineering waiting area");
				odgovori64.add("Doing pre-scrutineering");
				odgovori64.add("Drinking some water");
				Question q64=new RadioButtonQ (new JLabel("What is not allowed during waiting for scrutineering?"),odgovori64, "Parking the car in front of the scrutineering waiting area", null, null);
				lista_pitanja.add(q64);
				
				//PITANJE 65 -
				List <String> odgovori65=new ArrayList<String>();
				odgovori65.add("Informational flags only");
				odgovori65.add("Warning flags only");
				odgovori65.add("Command flags and informational flags");
				odgovori65.add("Command flags only");
				Question q65=new RadioButtonQ (new JLabel("What types of flags are used at the competition?"),odgovori65, "Command flags and informational flags", null, null);
				lista_pitanja.add(q65);
				
				//PITANJE 66 -
				List <String> odgovori66=new ArrayList<String>();
				odgovori66.add("Team captain, driver and chief engineer");
				odgovori66.add("Team captain and all drivers");
				odgovori66.add("Team captain and chief engineer");
				odgovori66.add("Team captain and a driver");
				Question q66=new RadioButtonQ (new JLabel("Who must attend the scrutineering briefing on Wednesday?"),odgovori66, "Team captain and chief engineer", null, null);
				lista_pitanja.add(q66);
				
				//PITANJE 67 - 
				List <String> odgovori67=new ArrayList<String>();
				odgovori67.add("No");
				odgovori67.add("No. The intent of a rule is not important");
				odgovori67.add("No. FSG-rules are written and checked by a lawyer. Every aspect of a rule is included");
				odgovori67.add("Yes. The violation of the intent of a rule will be considered as a violation of the rule itself");
				Question q67=new RadioButtonQ (new JLabel("Is it possible to violate a rule, even though the rule is followed literally (word by word)?"),odgovori67, "Yes. The violation of the intent of a rule will be considered as a violation of the rule itself", null, null);
				lista_pitanja.add(q67);
				
				//PITANJE 68 -
				List <String> odgovori68=new ArrayList<String>();
				odgovori68.add("scrutineering, pre-scrutineering, tilt table test, brake test");
				odgovori68.add("pre-scrutineering, scrutineering, tilt table test, brake test");
				odgovori68.add("brake test, scrutineering, tilt table test, pre-scrutineering");
				odgovori68.add("scrutineering, pre-scrutineering, brake test, tilt table test");
				Question q68=new RadioButtonQ (new JLabel("What is the right order of technical inspection parts to be completed before entering a dynamic event?"),odgovori68, "pre-scrutineering, scrutineering, tilt table test, brake test", null, null);
				lista_pitanja.add(q68);
				
				//PITANJE 69 -
				List <String> odgovori69=new ArrayList<String>();
				odgovori69.add("Quickjack");
				odgovori69.add("Fire extinguishers");
				odgovori69.add("Helmets");
				odgovori69.add("Driver gear");
				Question q69=new RadioButtonQ (new JLabel("What should not be brought to pre-scrutineering?"),odgovori69, "Quickjack", null, null);
				lista_pitanja.add(q69);
				
				//PITANJE 70 -
				List <String> odgovori70=new ArrayList<String>();
				odgovori70.add("Yes, because Pre-Scrutineering is optional");
				odgovori70.add("Yes");
				odgovori70.add("No");
				odgovori70.add("Yes, because the team was late and Scrutineering is more important than Pre-Scrutineering");
				Question q70=new RadioButtonQ (new JLabel("Is M/E-Scrutineering possible without Pre-Scrutineering?"),odgovori70, "No", null, null);
				//lista_pitanja.add(q70);
				
				//PITANJE 71 -
				List <String> odgovori71=new ArrayList<String>();
				odgovori71.add("Nothing - it's up to the technical inspectors sto check the car");
				odgovori71.add("It doesn't matter if one part of the Inspection Form is not visible. Every team has got one joker");
				odgovori71.add("All items on the Inspection Sheet must be clearly visible to the technical inspectors");
				odgovori71.add("Nothing - not-visible parts can be checked by using e.g. mirrors or an endoscope");
				Question q71=new RadioButtonQ (new JLabel("What is important to check before Technical Inspection regarding visibility (after removing body panels or removable access panels)?"),odgovori71, "All items on the Inspection Sheet must be clearly visible to the technical inspectors", null, null);
				lista_pitanja.add(q71);
				
				//PITANJE 72 -
				List <String> odgovori72=new ArrayList<String>();
				odgovori72.add("1 minute");
				odgovori72.add("2 minutes");
				odgovori72.add("4 minutes");
				odgovori72.add("3 minutes");
				Question q72=new RadioButtonQ (new JLabel("What time penalty will a team get for not being ready-to-run when their turn for their endurance run arrives?"),odgovori72, "2 minutes", null, null);
				lista_pitanja.add(q72);
				
				//PITANJE 73 -
				List <String> odgovori73=new ArrayList<String>();
				odgovori73.add("The driver encourages the pushing team member to run");
				odgovori73.add("The driver is wearing his dynamic area vest under over his race suit");
				odgovori73.add("The driver is not wearing a dynamic area vest, it is with another team member who is escorting the driver");
				odgovori73.add("The driver must be drinking a beer");
				Question q73=new RadioButtonQ (new JLabel("Which of the following statements about a driver is correct when a car is pushed into a dynamic area?"),odgovori73, "The driver is not wearing a dynamic area vest, it is with another team member who is escorting the driver", null, null);
				//lista_pitanja.add(q73);
				
				//PITANJE 74 -
				List <String> odgovori74=new ArrayList<String>();
				odgovori74.add("30 second time penalty");
				odgovori74.add("10 second time penalty");
				odgovori74.add("20 second time penalty");
				odgovori74.add("5 second time penalty");
				Question q74=new RadioButtonQ (new JLabel("What is the penalty if missing one or more gates of a given slalom at the Endurance?"),odgovori74, "20 second time penalty", null, null);
				lista_pitanja.add(q74);
				
				//PITANJE 75 - 
				List <String> odgovori75=new ArrayList<String>();
				odgovori75.add("The time needed for inspection will be added as penalty");
				odgovori75.add("No time penalty");
				odgovori75.add("20 second penalty");
				odgovori75.add("The time needed for inspection will be doubled and added as penalty");
				Question q75=new RadioButtonQ (new JLabel("How is the penalty calculated for the time taken for mechanical inspection under a 'mechanical black flag' at the Endurance?"),odgovori75, "No time penalty", null, null);
			//	lista_pitanja.add(q75);
				
				//PITANJE 76 -
				List <String> odgovori76=new ArrayList<String>();
				odgovori76.add("Do a test drive on the test track");
				odgovori76.add("Fill up the car with all the necessary fluids");
				odgovori76.add("Brake test");
				odgovori76.add("remove steering wheel");
				Question q76=new RadioButtonQ (new JLabel("What must be done before the tilt table test?"),odgovori76, "Fill up the car with all the necessary fluids", null, null);
				lista_pitanja.add(q76);
				
				//PITANJE 77 -
				List <String> odgovori77=new ArrayList<String>();
				odgovori77.add("Each team must have at least two(2) 0.9kg (2 lb.) dry chemical/dry powder");
				odgovori77.add("Water - because it is more environmental-friendly");
				odgovori77.add("Aqueous Film Forming Foam (AFFF)");
				odgovori77.add("There are no specifications");
				Question q77=new RadioButtonQ (new JLabel("What type of fire extinguisher is required"),odgovori77, "Each team must have at least two(2) 0.9kg (2 lb.) dry chemical/dry powder", null, null);
				//lista_pitanja.add(q77);
				
				//PITANJE 78 -
				List <String> odgovori78=new ArrayList<String>();
				odgovori78.add("Any time, waiting with the car in front of the waiting area until there is an empty scrutineering spot");
				odgovori78.add("Never, scrutineering is optional and not obligatory");
				odgovori78.add("When the Technical Inspecion Status (TIS) of your car is set to 'M/E Waiting Queue");
				odgovori78.add("Every team will be picked individually by a pit marshal for scrutineering");
				Question q78=new RadioButtonQ (new JLabel("When does a team have to leave their pit for scrutineering?"),odgovori78, "When the Technical Inspecion Status (TIS) of your car is set to 'M/E Waiting Queue", null, null);
				lista_pitanja.add(q78);
				
				//PITANJE 79 -
				List <String> odgovori79=new ArrayList<String>();
				odgovori79.add("Looking at other impressive cars");
				odgovori79.add("Having two wing persons walking with the car");
				odgovori79.add("Using tyre protectors");
				odgovori79.add("Moving faster than normal walking pace");
				Question q79=new RadioButtonQ (new JLabel("What is not allowed when pushing a car?"),odgovori79, "Moving faster than normal walking pace", null, null);
				lista_pitanja.add(q79);
				
				//PITANJE 80 -
				List <String> odgovori80=new ArrayList<String>();
				odgovori80.add("1000 mm x 500 mm x 1100 mm");
				odgovori80.add("1100 mm x 500 mm x 1000 mm");
				odgovori80.add("1000 mm x 500 mm x 1100 cm");
				odgovori80.add("1100 cm x 500 mm x 1000 mm");
				Question q80=new RadioButtonQ (new JLabel("What is maximum toolbox size that can be brought for scrutineering (height x width x length)?"),odgovori80, "1000 mm x 500 mm x 1100 mm", null, null);
				lista_pitanja.add(q80);
				
				//PITANJE 81 -
				List <String> odgovori81=new ArrayList<String>();
				odgovori81.add("taking down tires");
				odgovori81.add("repairing or improving");
				odgovori81.add("removing body panels");
				odgovori81.add("removing the driver seat");
				Question q81=new RadioButtonQ (new JLabel("What kind of work is not allowed in the inspection box at M-scrutineering?"),odgovori81, "repairing or improving", null, null);
				//lista_pitanja.add(q81);
				
				//PITANJE 82 -
				List <String> odgovori82=new ArrayList<String>();
				odgovori82.add("Adjustment of the wing angle");
				odgovori82.add("Replacing worn brake pads");
				odgovori82.add("Changing the springs of the suspension system");
				odgovori82.add("Changing the steering wheel");
				Question q82=new RadioButtonQ (new JLabel("Which modification to the car is not allowed without rescrutineering?"),odgovori82, "Replacing worn brake pads", null, null);
				//lista_pitanja.add(q82);
				
				//PITANJE 83  //Ceska 2015 -
				List <String> odgovori83=new ArrayList<String>();
				odgovori83.add("72 V");
				odgovori83.add("whatever the maximum battery voltage is");
				odgovori83.add("16 V");
				odgovori82.add("60 V");
				odgovori82.add("48 V");
				Question q83=new RadioButtonQ (new JLabel("What is the voltage limit for a shifting system in an IC car?"),odgovori83, "whatever the maximum battery voltage is", null, null);
				//lista_pitanja.add(q83);
				
				//PITANJE 84 -
				List <String> odgovori84=new ArrayList<String>();
				odgovori84.add("You have to create the missing addenda during the judging");
				odgovori84.add("The electronic copy is judged");
				odgovori84.add("You are disqualified from the cost event");
				odgovori84.add("The printed copy is judged, because it is newer");
				Question q84=new RadioButtonQ (new JLabel("What happens if there are differences between your printed copy of the cos report and the electronic copy that you submitted, given that you did not submit any addenda?"),odgovori84, "The printed copy is judged, because it is newer", null, null);
				lista_pitanja.add(q84);
				
				//PITANJE 85 -
				List <String> odgovori85=new ArrayList<String>();
				odgovori85.add("The catch cans of the cooling system and the engine lubrication system must have a minimum volume of 1L");
				odgovori85.add("There is no requirement regarding the height at which catch cans are installed");
				odgovori85.add("It is prohibited to use beer cans as catch cans");
				odgovori85.add("Only catch cans of the cooling system need a hose at their vent");
				Question q85=new RadioButtonQ (new JLabel("Which of the following statements regarding the catch cans is correct?"),odgovori85, "Only catch cans of the cooling system need a hose at their vent", null, null);
				lista_pitanja.add(q85);
				
				//PITANJE 86 -
				List <String> odgovori86=new ArrayList<String>();
				odgovori86.add("If the engine is not at least five years old");
				odgovori86.add("If the engine is turbo-charged");
				odgovori86.add("If the engine is not equipped with a carburetor in its original configuration");
				odgovori86.add("It is allowed to use a carburetor in any case");
				Question q86=new RadioButtonQ (new JLabel("In which case is the use of a carburetor prohibited?"),odgovori86, "If the engine is turbo-charged", null, null);
				lista_pitanja.add(q86);
				
				//PITANJE 87 -
				List <String> odgovori87=new ArrayList<String>();
				odgovori87.add("The maximum distance between the LEDs is 1 mm");
				odgovori87.add("Each LED must have a minimum diameter of 3 mm");
				odgovori87.add("The line must be at least 150 mm long");
				odgovori87.add("It is not allowed to use a single line of LEDs as brake light");
				Question q87=new RadioButtonQ (new JLabel("If a single line of LEDs is used as brake light, which of the following statements is correct?"),odgovori87, "The line must be at least 150 mm long", null, null);
				lista_pitanja.add(q87);
				
				//PITANJE 88 //nije poslat odgovor Pitanje 7
				List <String> odgovori88=new ArrayList<String>();
				odgovori88.add("11.5");
				odgovori88.add("11");
				odgovori88.add("12.5");
				odgovori88.add("10.5");
				Question q88=new RadioButtonQ (new JLabel("<html>Your engine has a bore x stroke of 67mm x 42.5mm and a compression ratio of 12:1.<br/> What will the compression ratio be if you install a head gasket that is 0.3mm thicker than the original one?</html>"),odgovori88, "11.5", null, null);
				//lista_pitanja.add(q88);
				
				//PITANJE 89 -
				List <String> odgovori89=new ArrayList<String>();
				odgovori89.add("It must be possible that two individuals can see the sight tube and the fuel level line during refueling without any assistance");
				odgovori89.add("The sight tube must have an inner diameter of at least 6 mm");
				odgovori89.add("A permanent non-movable fuel level line must be applied at the middle of the sight tube");
				odgovori89.add("The inner diameter of the filler neck must be at least 38 mm");
				Question q89=new RadioButtonQ (new JLabel("Which statement regarding the fuel filler neck is NOT correct?"),odgovori89, "The inner diameter of the filler neck must be at least 38 mm", null, null);
				lista_pitanja.add(q89);
				
				//PITANJE 90 -
				List <String> odgovori90=new ArrayList<String>();
				odgovori90.add("There are no requirements by the rules regarding the attachment of the fuel tank");
				odgovori90.add("The maximum size of the fuel tank is 7.2 L");
				odgovori90.add("The fuel tank must be rigid");
				odgovori90.add("The fuel system must have a provision for emptying the fuel tank");
				Question q90=new RadioButtonQ (new JLabel("Which statement regarding the fuel tank is correct?"),odgovori90, "The fuel system must have a provision for emptying the fuel tank", null, null);
				lista_pitanja.add(q90);
				
				//PITANJE 91 -
				List <String> odgovori91=new ArrayList<String>();
				odgovori91.add("Yes, but the air for each engine must pass through a restrictor of a diameter of 20 mm divided by the number of engines");
				odgovori91.add("No, that is prohibited");
				odgovori91.add("Yes, but total displacement must not exceed 610ccm and the air for all engines must pass through a signle restrictor");
				odgovori91.add("Yes, as long as none of the engines has a displacement of more than 610ccm");
				Question q91=new RadioButtonQ (new JLabel("Is it allowed to use more than one engine?"),odgovori91, "Yes, but total displacement must not exceed 610ccm and the air for all engines must pass through a signle restrictor", null, null);
				lista_pitanja.add(q91);
				
				//PITANJE 92 -
				List <String> odgovori92=new ArrayList<String>();
				odgovori92.add("Yes, but a version in Roman characters which have a different color must also be on the car");
				odgovori92.add("Yes, but a version in Roman letters must be uppermost on both sides of the vehicle");
				odgovori92.add("It is generally prohibited to have the school name in non-Roman characters on the vehicle");
				odgovori92.add("Yes, it is sufficient to have the school name in characters which are common in the country the team comes from (e.g Cyrillic, Pinyin etc.)");
				Question q92=new RadioButtonQ (new JLabel("Is it allowed to have the school name in non-Roman characters on the vehicle?"),odgovori92, "Yes, but a version in Roman letters must be uppermost on both sides of the vehicle", null, null);
				//lista_pitanja.add(q92);
				
				//PITANJE 93 - 
				List <String> odgovori93=new ArrayList<String>();
				odgovori93.add("7.5 kN (1700 pounds) for a section with a diameter of 25mm (1 inch)");
				odgovori93.add("15 kN (3400 pounds) for a section with a diameter of 25mm (1 inch)");
				odgovori93.add("7.5 kN (1700 pounds) for a section with a diameter of 50mm (2 inch)");
				Question q93=new RadioButtonQ (new JLabel("The perimeter shear strength of the monocoque laminate should be at least"),odgovori93, "7.5 kN (1700 pounds) for a section with a diameter of 25mm (1 inch)", null, null);
				lista_pitanja.add(q93);
				
				//PITANJE 94 //Nemacka 2016 -nije poslat odgovor
				List <String> odgovori94=new ArrayList<String>();
				odgovori94.add("4");
				odgovori94.add("2");
				odgovori94.add("6");
				odgovori94.add("3");
				odgovori94.add("5");
				odgovori94.add("1");
				Question q94=new RadioButtonQ (new JLabel("How many different tire sizes could theoretical be used on a car during a FSG endurance?"),odgovori94, "4", null, null);
				//lista_pitanja.add(q94);
				
				//PITANJE 95
				List <String> odgovori95=new ArrayList<String>();
				odgovori95.add("26");
				odgovori95.add("32");
				odgovori95.add("29");
				odgovori95.add("16");
				odgovori95.add("58");
				odgovori95.add("59");
				odgovori95.add("13");
				Question q95=new RadioButtonQ (new JLabel("How many non-removeble plyons are used to construct the two circles fo the skid pad?"),odgovori95, "58", null, null);
				//lista_pitanja.add(q95);
				
				//PITANJE 96 -popunicemo ovo pitanje sa jednim koje fali
				List <String> odgovori96=new ArrayList<String>();
				odgovori96.add("");
				odgovori96.add("");
				odgovori96.add("");
				odgovori96.add("");
				Question q96=new RadioButtonQ (new JLabel(""),odgovori96, "", null, null);
				//lista_pitanja.add(q96);
				
				//PITANJE 97 -nije poslat odgovor
				List <String> odgovori97=new ArrayList<String>();
				odgovori97.add("105 dB(C)");
				odgovori97.add("104.1 dB(C)");
				odgovori97.add("108.9 dB(C)");
				odgovori97.add("107.1 dB(C)");
				odgovori97.add("106.2 dB(C)");
				odgovori97.add("202 dB(C)");
				odgovori97.add("205 dB(C)");
				Question q97=new RadioButtonQ (new JLabel("An theoretical engine produces a specific noise spectrum with a soundpressure level of 105 dB(C) @ 31.5 Hz <br/>and 100 dB @ 1000 Hz measured in 1 meter distance. What will be the C-Weighted total soundpressure level in 1 meter distance?</html>"),odgovori97, "105 dB(C)", null, null);
			//	lista_pitanja.add(q97);
				
				//PITANJE 98 -nije poslat odgovor
				List <String> odgovori98=new ArrayList<String>();
				odgovori98.add("185 cm2");
				odgovori98.add("36 sq. inch");
				odgovori98.add("235 cm2");
				odgovori98.add("30 sq. inch");
				Question q98=new RadioButtonQ (new JLabel("How much is the maximum surface area difference between the minimum required fixed and moveable head restraint type?"),odgovori98, "185 cm2", null, null);
				//lista_pitanja.add(q98);
				
				//PITANJE 95 -
				List <String> odgovori99=new ArrayList<String>();
				odgovori99.add("15.24 m/min");
				odgovori99.add("1524 cm/s");
				odgovori99.add("15.24 m/s");
				odgovori99.add("1524 m/s");
				odgovori99.add("9144 cm/s");
				odgovori99.add("91.44 m/min");
				odgovori99.add("914.4 m/s");
				Question q99=new RadioButtonQ (new JLabel("What is the average piston speed used for the noise test of automotive and motorcycle engines?"),odgovori99, "15.24 m/s", null, null);
				lista_pitanja.add(q99);
				
				//PITANJE 100 -
				List <String> odgovori100=new ArrayList<String>();
				odgovori100.add("80.7 %");
				odgovori100.add("28.9 %");
				odgovori100.add("40.6 %");
				odgovori100.add("71.1 %");
				odgovori100.add("19.3 %");
				Question q100=new RadioButtonQ (new JLabel("What is the procentual deviation of the yield strength between a grade 8.8 and a grade 10.9 bolt?"),odgovori100, "40.6 %", null, null);
				//lista_pitanja.add(q100);
				
				//PITANJE 101 -nije poslat odgovor
				List <String> odgovori101=new ArrayList<String>();
				odgovori101.add("Real case");
				odgovori101.add("Presentation");
				odgovori101.add("Cost report");
				odgovori101.add("Discussion");
				Question q101=new RadioButtonQ (new JLabel("Which of the following points is not an official part of the cost and manufacturing event?"),odgovori101, "Real case", null, null);
				//lista_pitanja.add(q101);
				
				//PITANJE 102 -
				List <String> odgovori102=new ArrayList<String>();
				odgovori102.add("50 mm");
				odgovori102.add("46 mm");
				odgovori102.add("56 mm");
				odgovori102.add("60 mm");
				odgovori102.add("48 mm");
				odgovori102.add("44 mm");
				Question q102=new RadioButtonQ (new JLabel("What is the minimum height of the school name?"),odgovori102, "50 mm", null, null);
			//	lista_pitanja.add(q102);
				
				//PITANJE 103 -nije poslat odgovor
				List <String> odgovori103=new ArrayList<String>();
				odgovori103.add("+649 EUR");
				odgovori103.add("-1361 EUR");
				odgovori103.add("-948 EUR");
				odgovori103.add("+1450 EUR");
				odgovori103.add("-1450 EUR");
				odgovori103.add("+356 EUR");
				odgovori103.add("-560 EUR");
				Question q103=new RadioButtonQ (new JLabel("<html>What an addendum to the cost report a team removes for 1340 EUR of the material costs <br/>and adds 356 EUR of material costs, what is netto difference in the table cost?</html>"),odgovori103,"+649 EUR", null, null);
				//lista_pitanja.add(q103);
				
				//PITANJE 104 -nije poslat odgovor
				List <String> odgovori104=new ArrayList<String>();
				odgovori104.add("Round head bolt metric grade 8.8 with Loctite");
				odgovori104.add("Flathead bolt metric grade 8.8 with lockwire");
				odgovori104.add("Round head bolt metric grade 10.9 with prevailing torque lock nut");
				odgovori104.add("Allen bolt metric grade 10.9 with a nylon locknut");
				odgovori104.add("Allen bolt metric grade 8.8 bolt with a nylon locknut");
				odgovori104.add("Allen bolt metric grade 10.9 with a selflocking helicoil");
				odgovori104.add("Hex head cap bolt metric grade 10.9 with Locktite");
				odgovori104.add("Hex head cap bolt metric grade 8.8 with prevailing torque lock nut");
				Question q104=new RadioButtonQ (new JLabel("Which type of fastening method is allowed for the mountning of the brake caliper?"),odgovori104, "Round head bolt metric grade 8.8 with Loctite", null, null);
				//lista_pitanja.add(q104);
				
				//PITANJE 105 -
				List <String> odgovori105=new ArrayList<String>();
				odgovori105.add("79 kilo");
				odgovori105.add("76 kilo");
				odgovori105.add("78 kilo");
				odgovori105.add("75 kilo");
				odgovori105.add("77 kilo");
				odgovori105.add("80 kilo");
				Question q105=new RadioButtonQ (new JLabel("What is the weight of the driver according to the FSAE2016 rules?"),odgovori105, "77 kilo", null, null);
				lista_pitanja.add(q105);
				
				//PITANJE 106 -
				List <String> odgovori106=new ArrayList<String>();
				odgovori106.add("0.5 liter");
				odgovori106.add("1.5 liter");
				odgovori106.add("1.4 liter");
				odgovori106.add("0.05 liter");
				odgovori106.add("1.0 liter");
				odgovori106.add("1.2 liter");
				odgovori106.add("0.9 liter");
				Question q106=new RadioButtonQ (new JLabel("What is the minimum volume of an oil catch-can connected to a vent of a transmission containing 14 liters of oil?"),odgovori106, "1.4 liter", null, null);
				//lista_pitanja.add(q106);
				
				//PITANJE 107 //AUSTRIA 2016 -nije poslat odgovor
				List <String> odgovori107=new ArrayList<String>();
				odgovori107.add("4");
				odgovori107.add("any multiple of 4");
				odgovori107.add("8");
				odgovori107.add("as many as i want, as long as the are presented at scrutineering and of the same type/compound");
				Question q107=new RadioButtonQ (new JLabel("Having no tire defects and dry track conditions, how many dry tires are you allowed to use during all of the dynamic events at FSA?"),odgovori107, "4", null, null);
				//lista_pitanja.add(q107);
				
				//PITANJE 108 -nije poslat odgovor
				List <String> odgovori108=new ArrayList<String>();
				odgovori108.add("30.0 deg.");
				odgovori108.add("60.0 deg.");
				odgovori108.add("28.16 deg.");
				odgovori108.add("33.7 deg.");
				odgovori108.add("52.8 deg.");
				odgovori108.add("56.3 deg.");
				Question q108=new RadioButtonQ (new JLabel("To which angle would you have to tilt a car so that the direction of gravity is colinear with the forces experienced during lateral acceleration of 1.5g on track?"),odgovori108, "30.0 deg.", null, null);
				//lista_pitanja.add(q108);
				
				//PITANJE 109 -
				List <String> odgovori109=new ArrayList<String>();
				odgovori109.add("21.25 m");
				odgovori109.add("50.03 ft");
				odgovori109.add("18.25 m");
				odgovori109.add("16.75 m");
				odgovori109.add("25.25 m");
				Question q109=new RadioButtonQ (new JLabel("What is diameter of the Skid Pad track measured at the center of the track?"),odgovori109, "16.75 m", null, null);
				lista_pitanja.add(q109);
				
				//PITANJE 110 -
				List <String> odgovori110=new ArrayList<String>();
				odgovori110.add("pop-off valves are prohibited, recirculation valves are allowed");
				odgovori110.add("recirculation valve piping may not have an ID larger than the restrictor (19/20)");
				odgovori110.add("the recirculation valve may vent to a location upstream of the restrictor");
				odgovori110.add("pop-off valves are allowed, recirculation valves are prohibited");
				odgovori110.add("they may only be connected to the intage section between the compressor and the throttle body");
				Question q110=new RadioButtonQ (new JLabel("Which is true about pop-off / recirculation valves in boosted applications?"),odgovori110, "they may only be connected to the intage section between the compressor and the throttle body", null, null);
			//	lista_pitanja.add(q110);
				 
				//PITANJE 111 -nije poslat odgovor
				List <String> odgovori111=new ArrayList<String>();
				odgovori111.add("10ms FIR Filter (ISO-19575)");
				odgovori111.add("Class 60 filter (SAE-J211)");
				odgovori111.add("3rd Order 100 Hz lowpass");
				Question q111=new RadioButtonQ (new JLabel("What kind post-processing is not allowed to remove acceleration spikes from the IAD data:?"),odgovori111, "10ms FIR Filter (ISO-19575)", null, null);
				//lista_pitanja.add(q111);
				
				//PITANJE 112 //Ceska 2016 -
				List <String> odgovori112=new ArrayList<String>();
				odgovori112.add("205mm");
				odgovori112.add("215mm");
				odgovori112.add("222mm");
				odgovori112.add("0mm");
				Question q112=new RadioButtonQ (new JLabel("<html>A vehicle with the mass 190kg, wheelbase 1,56m and tyre static radius 222mm is weighted. Scales measure 83kg (front) and 107kg (rear) <br/>when the car is measured on the perfectly flat ground and the same values when the rear axle is elevated by 0.85m. What is the car's COG height?</html>"),odgovori112, "0mm", null, null);
				lista_pitanja.add(q112);
				
				//PITANJE 113 -
				List <String> odgovori113=new ArrayList<String>();
				odgovori113.add("Young's modulus 205GPa (29730ksi), yield strength 300MPa (43,5ksi), ultimate strength 355MPa (51,5ksi)");
				odgovori113.add("Young's modulus 200GPa (29000ksi), yield strength 305MPa (44,2ksi), ultimate strength 355MPa (51,5ksi)");
				odgovori113.add("Young's modulus 210GPa (30450ksi), yield strength 305MPa (44,2ksi), ultimate strength 355MPa (51,5ksi)");
				odgovori113.add("Young's modulus 200GPa (29000ksi), yield strength 310MPa (45,0ksi), ultimate strength 400MPa (58,0ksi)");
				Question q113=new RadioButtonQ (new JLabel("What are the baseline steel properties?"),odgovori113, "Young's modulus 200GPa (29000ksi), yield strength 310MPa (45,0ksi), ultimate strength 400MPa (58,0ksi)", null, null);
				lista_pitanja.add(q113);
				
				//PITANJE 114 - nije poslat odgovor
				List <String> odgovori114=new ArrayList<String>();
				odgovori114.add("Power Tool <=25,4mm");
				odgovori114.add("Ratchet <=25,4mm");
				odgovori114.add("Wrench <=25,4mm");
				odgovori114.add("Reaction Tool <=25,4mm");
				Question q114=new RadioButtonQ (new JLabel("Which process doesn't require fastener installation multiplier?"),odgovori114, "Power Tool <=25,4mm", null, null);
				//lista_pitanja.add(q114);
				
				//PITANJE 115 -
				List <String> odgovori115=new ArrayList<String>();
				odgovori115.add("Magnesium - Aluminum - Titanium - Steel");
				odgovori115.add("Aluminum - Magnesium - Titanium - Steel");
				odgovori115.add("Titanium - Magnesium - Aluminum - Steel");
				odgovori115.add("Magnesium - Aluminum - Steel - Titanium");
				Question q115=new RadioButtonQ (new JLabel("Select the materials correctly sorted by their density from the last dense to the most dense."),odgovori115, "Magnesium - Aluminum - Titanium - Steel", null, null);
				lista_pitanja.add(q115);
				
				//PITANJE 116 -nije poslat odgovor
				List <String> odgovori116=new ArrayList<String>();
				odgovori116.add("93,2 deg.C");
				odgovori116.add("91,2 deg.C");
				odgovori116.add("97,2 deg.C");
				odgovori116.add("95,2 deg.C");
				Question q116=new RadioButtonQ (new JLabel("<html>What is the outlet temperature of the engine coolin system? The engine is four cylinder spark ignited and its displacement is 1.998 litre <br/>Maximum engine brake power is 153 horse power at 5500 RPM. The engine is running on mixture of air and 98 octane gasoline with <br/>coefficient of air excess of 0.95. The measurement of engine heat balance showed that 35% of fuel energy is used for mechanical work, 27% <br/>of fuel energy go to cooling system and 38% is lost with exhaust gases. The coolant fluid is mixute of ethylenglykol and water with <br/>mixture density of 1049 kg/m3 and mixture specific heat capacity of 3460 J/kgK. The coolant inlet temperature is 355.15 K and volumetric <br/>flow rate is 109 litre/min.</html>"),odgovori116, "93,2 deg.C", null, null);
				//lista_pitanja.add(q116);
				
				//PITANJE 117 -
				List <String> odgovori117=new ArrayList<String>();
				odgovori117.add("Dampers");
				odgovori117.add("Wheel hubs");
				odgovori117.add("Pushrods");
				odgovori117.add("Uprights");
				Question q117=new RadioButtonQ (new JLabel("Which of the components do not belong to the SUspension Area of Comodity (BOM Category)"),odgovori117, "Wheel hubs", null, null);
				lista_pitanja.add(q117);
				
				//PITANJE 118 -
				List <String> odgovori118=new ArrayList<String>();
				odgovori118.add("32.4 %");
				odgovori118.add("37.8 %");
				odgovori118.add("40.1 %");
				odgovori118.add("45.3 %");
				Question q118=new RadioButtonQ (new JLabel("The engine specific fuel consumption is 210 g/kWh of the fuel defined by lower heating value 42,7 MJ/kg. What is the total efficiency of the engine?"),odgovori118, "40.1 %", null, null);
				//lista_pitanja.add(q118);
				
				//PITANJE 119 -nije poslat odgovor
				List <String> odgovori119=new ArrayList<String>();
				odgovori119.add("45,0 deg.");
				odgovori119.add("48,2 deg.");
				odgovori119.add("56,3 deg.");
				odgovori119.add("60,0 deg.");
				Question q119=new RadioButtonQ (new JLabel("What will be the fuel level angle (with respect to the horizontal plane in the tank, when the car is subjected to lateral acceleration 1.5g?"),odgovori119, "45,0 deg.", null, null);
				//lista_pitanja.add(q119);
				
				//PITANJE 120 -
				List <String> odgovori120=new ArrayList<String>();
				odgovori120.add("Lock washer");
				odgovori120.add("Bolt with thread locking compounds (i.e Locktite)");
				odgovori120.add("Bolt with nylon patches");
				odgovori120.add("Nylon lock nut (except in high temperature locations)");
				Question q120=new RadioButtonQ (new JLabel("Select positive locking mechanism"),odgovori120, "Nylon lock nut (except in high temperature locations)", null, null);
				lista_pitanja.add(q120);
				
				//PITANJE 121 -
				List <String> odgovori121=new ArrayList<String>();
				odgovori121.add("At least 38mm (1.5 inches) inner diameter, 125mm (4,9 inches) vertical height and angled at no more than 30 degrees from vertical");
				odgovori121.add("At least 38mm (1.5 inches) inner diameter, 125mm (4,9 inches) vertical height and angled at no more than 60 degrees from vertical");
				odgovori121.add("At least 38mm (1.5 inches) inner diameter, 125mm (4,9 inches) vertical height and angled at no more than 35 degrees from vertical");
				odgovori121.add("At least 38mm (1.5 inches) inner diameter, 125mm (4,9 inches) vertical height and angled at no more than 60 degrees from horizontal");
				Question q121=new RadioButtonQ (new JLabel("Fuel tank must have a filler neck"),odgovori121, "At least 38mm (1.5 inches) inner diameter, 125mm (4,9 inches) vertical height and angled at no more than 30 degrees from vertica", null, null);
				lista_pitanja.add(q121);
				
				//PITANJE 122  //Germany 2017  -nije poslat odgovor
				List <String> odgovori122=new ArrayList<String>();
				odgovori122.add("26.9");
				odgovori122.add("8.5");
				odgovori122.add("0.3");
				odgovori122.add("30.2");
				odgovori122.add("0.0");
				odgovori122.add("17.0");
				Question q122=new RadioButtonQ (new JLabel("<html>A Formula Student vehicle with a constant power of 25kW accelerates from standstill <\br> over 75m in 5.0 s with Driver A. With Driver B the same acceleration takes 5.1 s. <\br> Given that the acceleration resistance is the only resistance to overcome (no friction loss, no additional inertia, flat surface, no aerodynamic resistance, infinite grip): how muche heavier is Driver B? Answer in kilogramms and round to 1 decimal place."),odgovori122, "26.9", null, null);
				//lista_pitanja.add(q122);
				
				//PITANJE 123 -nije poslat odgovor
				List <String> odgovori123=new ArrayList<String>();
				odgovori123.add("0.86");
				odgovori123.add("0.85");
				odgovori123.add("0.89");
				odgovori123.add("0.90");
				odgovori123.add("0.88");
				odgovori123.add("0.87");
				Question q123=new RadioButtonQ (new JLabel("What is the minimum material volume of the head resistant? Answer in litres (round to 2 decimal places)"),odgovori123, "0.86", null, null);
				//lista_pitanja.add(q123);
				
				//PITANJE 124 -nije poslat odgovor
				List <String> odgovori124=new ArrayList<String>();
				odgovori124.add("41.12");
				odgovori124.add("64.47");
				odgovori124.add("67.43");
				odgovori124.add("63.93");
				odgovori124.add("67.97");
				odgovori124.add("37.62");
				Question q124=new RadioButtonQ (new JLabel("<html>The best skipad time of your team is 5.2s aditionally you have knocked down two cones, the fastest team without hitting any cones did it in 5.1s.<br/> What is the skipad score of your team? Answer in points and round to 2 decimal places.</html>"),odgovori124, "41.12", null, null);
				//lista_pitanja.add(q124);
				
				//PITANJE 125 -nije poslat odogovor
				List <String> odgovori125=new ArrayList<String>();
				odgovori125.add("12.10");
				odgovori125.add("9.07");
				odgovori125.add("18.09");
				odgovori125.add("18.15");
				odgovori125.add("24.20");
				odgovori125.add("9.08");
				Question q125=new RadioButtonQ (new JLabel("<html>When using a tab or bracket for a bolted joint in the primary structure,<br/> what should be the minimum distance from the center of the hole (radius 6.05mm) to the nearest free edge of the tab or bracket?<br/><br/> Answer in mm and round to 2 decimal places.</html>"),odgovori125, "12.10", null, null);
				//lista_pitanja.add(q125);
				
				//PITANJE 126 -nije poslat odgovor
				List <String> odgovori126=new ArrayList<String>();
				odgovori126.add("59.04");
				odgovori126.add("-0.6");
				odgovori126.add("0.6");
				odgovori126.add("30.96");
				odgovori126.add("-59.04");
				odgovori126.add("-30.96");
				Question q126=new RadioButtonQ (new JLabel("<html>Due to electromagnetic interference a sensor signal is distributed by a high frequency noise.<br/> To reduce this noise, you want to design a passive 1st-order Low-Pass filter with a cut-off frequency at Fc=300Hz. <br/>What is the resulting phase shift of the sensor signal at F=180Hz? <br/><br/>Answer in degrees, the right sign and round to 2 decimal places.</html>"),odgovori126, "59.04", null, null);
				//lista_pitanja.add(q126);
				
				//PITANJE 127 - nije poslat odgovor
				List <String> odgovori127=new ArrayList<String>();
				odgovori127.add("103");
				odgovori127.add("180");
				odgovori127.add("106");
				odgovori127.add("183");
				odgovori127.add("109");
				odgovori127.add("100");
				Question q127=new RadioButtonQ (new JLabel("<html>You are standing between a combustion vehicle, which is running idle and producing a 30 Hz tone at a sound pressure level of 103 dB(C) at your position,<br/> and an electric vehicle, which is sounding its 2 kHz tone as ready-to-drive sound at a sound pressure level of 80 dB(A) at your position.<br/> What is the non weighted combined sound pressure level measured at your position, considering that the sound sources are non-coherent and there are no other sound sources present?<br/> Answer in dB and round to 0 decimal places.</html>"),odgovori127, "103", null, null);
				//lista_pitanja.add(q127);
				/*
				//PITANJE 128 //Madjarska 2017 -nije uradjena
				List <String> odgovori128=new ArrayList<String>();
				odgovori128.add("Plan must relate to specific prototype, actual quality of prototype itself does matter");
				odgovori128.add("Plan must relate to specific prototype, actual prototype should be presented live to judges");
				odgovori128.add("Plan must relate to specific prototype, actual quality of prototype itself does not matter");
				odgovori128.add("None of the previous statements are correct");
				Question q128=new RadioButtonQ (new JLabel("Which of the followings are important for Business Plan Presentation judging?"),odgovori128, "Plan must relate to specific prototype, actual quality of prototype itself does matter", null, null);
				lista_pitanja.add(q128);
				
				//PITANJE 129 -nije poslat odgovor
				List <String> odgovori129=new ArrayList<String>();
				odgovori129.add("350 mm");
				odgovori129.add("50 mm");
				odgovori129.add("75 mm");
				odgovori129.add("100 mm");
				odgovori129.add("600 mm");
				Question q129=new RadioButtonQ (new JLabel("Which of these measures is not used to dimension the cockpit opening template?"),odgovori129, "350 mm", null, null);
				lista_pitanja.add(q129);
				
				//PITANJE 130 -nije poslat odgovor
				List <String> odgovori130=new ArrayList<String>();
				odgovori130.add("6 mm");
				odgovori130.add("8 mm");
				odgovori130.add("10 mm");
				odgovori130.add("5 mm");
				odgovori130.add("3 mm");
				Question q130=new RadioButtonQ (new JLabel("All forward facing horizontal edges of aerodynamic devices that could contact a pedestrian must have minimum radius of ...?"),odgovori130, "6 mm", null, null);
				lista_pitanja.add(q130);
				
				//PITANJE 131 -nije poslat odgovor
				List <String> odgovori131=new ArrayList<String>();
				odgovori131.add("Yes, if they are in the presentation room and presented the business concept");
				odgovori131.add("Yes, if they are in the presentation room and introduced to judges at the beginning");
				odgovori131.add("No, only if introduced");
				odgovori131.add("Yes, if they are in the presentation room");
				Question q131=new RadioButtonQ (new JLabel("Can any team member answer at Business Plan Presentation Event Q&A session?"),odgovori131, "Yes, if they are in the presentation room and presented the business concept", null, null);
				lista_pitanja.add(q131);
				
				//PITANJE 132 -nije poslat odogovor
				List <String> odgovori132=new ArrayList<String>();
				odgovori132.add("0.35-0.65");
				odgovori132.add("0.8-0.9");
				odgovori132.add("0.7-1");
				odgovori132.add("0.1-0.5");
				Question q132=new RadioButtonQ (new JLabel("What is the coefficient of friction between brake pads and rotors generally?"),odgovori132, "0.35-0.65", null, null);
				lista_pitanja.add(q132);
				
				//PITANJE 133 -nije poslat odgovor
				List <String> odgovori133=new ArrayList<String>();
				odgovori133.add("not regulated");
				odgovori133.add("52 mm");
				odgovori133.add("78 mm");
				odgovori133.add("26 mm");
				odgovori133.add("104 mm");
				Question q133=new RadioButtonQ (new JLabel("What is the minimum a main hoop tube can be bent (measured at tube centerline) if the outside diameter is 26 mm?"),odgovori133, "not regulated", null, null);
				lista_pitanja.add(q133);
				
				//PITANJE 134 -nije poslat odgovor
				List <String> odgovori134=new ArrayList<String>();
				odgovori134.add("1.8 mm");
				odgovori134.add("1 mm");
				odgovori134.add("2.8 mm");
				odgovori134.add("2.5 mm");
				odgovori134.add("2.4 mm");
				Question q134=new RadioButtonQ (new JLabel("What is the minimum wet tyre thread depth?"),odgovori134, "1.8 mm", null, null);
				lista_pitanja.add(q134);
				
				//PITANJE 135 -nije poslat odgovor
				List <String> odgovori135=new ArrayList<String>();
				odgovori135.add("1.378 kg");
				odgovori135.add("1.198 kg");
				odgovori135.add("1.511 kg");
				odgovori135.add("1.225 kg");
				odgovori135.add("1.0 kg");
				Question q135=new RadioButtonQ (new JLabel("<html>If any type tube diameter and wall whickness would be available how much would 1 m of shoulder harness steel tube weight <br/>if we choose the lightest? (Density is 7.85g/cm3)</html>"),odgovori135, "1.378 kg", null, null);
				lista_pitanja.add(q135);
				
				//PITANJE 136 -nije poslat odgovor
				List <String> odgovori136=new ArrayList<String>();
				odgovori136.add("6000 rpm");
				odgovori136.add("6355 rpm");
				odgovori136.add("5300 rpm");
				odgovori136.add("6500 rpm");
				Question q136=new RadioButtonQ (new JLabel("What engine speed the noise test should be made at if the bore/stroke of the engine are 95 mm x 72 mm?"),odgovori136, "6000 rpm", null, null);
				lista_pitanja.add(q136);
				
				//PITANJE 137  -nije poslat odgovor
				List <String> odgovori137=new ArrayList<String>();
				odgovori137.add("150 cm3");
				odgovori137.add("100 cm3");
				odgovori137.add("137 cm3");
				odgovori137.add("200 cm3");
				odgovori137.add("120 cm3");
				Question q137=new RadioButtonQ (new JLabel("What is the minimum volume of a vertical filler neck?"),odgovori137, "150 cm3", null, null);
				lista_pitanja.add(q137);
				*//*
				//PITANJE 138 //Ceska 2017 -
				List <String> odgovori138=new ArrayList<String>();
				odgovori138.add("100 mm");
				odgovori138.add("25 mm");
				odgovori138.add("150 mm");
				odgovori138.add("50 mm");
				Question q138=new RadioButtonQ (new JLabel("What is the minimal distance between throttle cables and any exhaust system component of the exhaust stream?"),odgovori138, "50 mm", null, null);
				lista_pitanja.add(q138);
				
				//PITANJE 139 -
				List <String> odgovori139=new ArrayList<String>();
				odgovori139.add("2,1 mm");
				odgovori139.add("2,2 mm");
				odgovori139.add("2,3 mm");
				odgovori139.add("2,4 mm");
				Question q139=new RadioButtonQ (new JLabel("What is the minimum tread depth of the wet tires?"),odgovori139, "2,4 mm", null, null);
				lista_pitanja.add(q139);
				
				//PITANJE 140 -
				List <String> odgovori140=new ArrayList<String>();
				odgovori140.add("The upper member must connect the main hoop and the front hoop. It must be at height between 250 mm and 320 mm above the lowest inside chassis point between the front and main hoop.");
				odgovori140.add("The upper member must connect the main hoop and the front hoop. It must be at height between 240 mm and 320 mm above the lowest inside chassis point between the front and main hoop.");
				odgovori140.add("The upper member must connect the main hoop and the front hoop. It must be at height between 320 mm and 240 mm above the lowest inside chassis point between the front and main hoop.");
				odgovori140.add("The upper member must connect the main hoop and the front hoop. It must be at height between 240 mm and 320 mm above the lowest inside chassis point between the bulkhead and main hoop.");
				Question q140=new RadioButtonQ (new JLabel("How is the side impact structure design limited?"),odgovori140, "The upper member must connect the main hoop and the front hoop. It must be at height between 240 mm and 320 mm above the lowest inside chassis point between the front and main hoop.", null, null);
				lista_pitanja.add(q140);
				
				//PITANJE 141 -
				List <String> odgovori141=new ArrayList<String>();
				odgovori141.add("30");
				odgovori141.add("60");
				odgovori141.add("12");
				odgovori141.add("24");
				Question q141=new RadioButtonQ (new JLabel("How many degrees of freedom has one isoparametri quadratic tetrahedron finite element?"),odgovori141, "30", null, null);
				lista_pitanja.add(q141);
				
				//PITANJE 142 - 
				List <String> odgovori142=new ArrayList<String>();
				odgovori142.add("The team must present vehicle in finished condition, fully assembled and ready-to-race with dry tires mounted.");
				odgovori142.add("Presented vehicle must have passed the technical inspection.");
				odgovori142.add("The Bill of Material must be based on the actual manufacturin processes used for the prototype.");
				odgovori142.add("The team must discuss with judges to show general understanding of the manufacturing knowledge.");
				Question q142=new RadioButtonQ (new JLabel("Which of the following conditions does not have to be fulfilled during the Cost and Manufacturing event?"),odgovori142, "Presented vehicle must have passed the technical inspection.", null, null);
				lista_pitanja.add(q142);
				
				//PITANJE 143 -nije poslat odgovor
				List <String> odgovori143=new ArrayList<String>();
				odgovori143.add("Cost of paint on non-corrosive materials");
				odgovori143.add("Cost of camera devices placed on vehicle during race");
				odgovori143.add("Cost of datalogging devices");
				odgovori143.add("Cost of hand or power tools");
				Question q143=new RadioButtonQ (new JLabel("What must be included in vehicle manufacruting cost presented at the Cost and Manufacturing event:"),odgovori143, "Cost of paint on non-corrosive materials", null, null);
				//lista_pitanja.add(q143);
				
				//PITANJE 144 -nije poslat odgovor
				List <String> odgovori144=new ArrayList<String>();
				odgovori144.add("158 Hz");
				odgovori144.add("168 Hz");
				odgovori144.add("178 Hz");
				odgovori144.add("198 Hz");
				Question q144=new RadioButtonQ (new JLabel("<html>What is the first natural frequency of the steel coil spring with spring rate (stiffness) 19500 N/m, <br/> wire diameter 5 mm, nominal spring diameter 30mm and 12 coils</html>"),odgovori144, "158 Hz", null, null);
				lista_pitanja.add(q144);
				
				//PITANJE 145 -nije poslat odgovor
				List <String> odgovori145=new ArrayList<String>();
				odgovori145.add("31.0%");
				odgovori145.add("32.5%");
				odgovori145.add("34.0%");
				odgovori145.add("35.5%");
				Question q145=new RadioButtonQ (new JLabel("<html>What is brake efficiency of 4stroke 2 cylinder engine with bore 80 mm and stroke 55mm. <br/>Engine power is defined by the 12 bar of mean effective pressure at 9500 RPM. Engine is running on the unleaded gasoline with density 740 kg/m3, <br/>octane number 98 and lower heating value of 42.53 Mj/kg. <br/>Actual lambda value at defined load point is 1.05 and stochiometric ratio of the used fuel is 14.17. Engine is running at following barometric conditions: <br/>barometric pressure 985mbar, <br/>temperature 24 degC.<br/> Volumetric efficiency defined to the atmospeheric conditions was 1.07.</html>"),odgovori145, "31.0%", null, null);
				//lista_pitanja.add(q145);
				
				//PITANJE 146 //Austria 2017 -
				List <String> odgovori146=new ArrayList<String>();
				odgovori146.add("All tires on one axle must be of the same manufacturer, compound and size");
				odgovori146.add("All tires on car must be of the same manufacturer, compound and size");
				odgovori146.add("The vehicle may have different tires on all four corners but the configuration must be the same as presented during tech inspection");
				odgovori146.add("All tires on one axle must be of the same manufacturer and compound but may have different sizes");
				Question q146=new RadioButtonQ (new JLabel("How many different tires are allowed on a car?"),odgovori146, "All tires on one axle must be of the same manufacturer, compound and size", null, null);
				lista_pitanja.add(q146);
				
				//PITANJE 147 -
				List <String> odgovori147=new ArrayList<String>();
				odgovori147.add("If i change nothing and nothing breaks, I can not be disqualified for technical reasons");
				odgovori147.add("I am allowed to participate in dynamic events");
				odgovori147.add("My vehicle is completely safe");
				odgovori147.add("I am only allowed to go to practice area");
				odgovori147.add("My car is completely rules compliant");
				odgovori147.add("I am eligible for the design finals");
				Question q147=new RadioButtonQ (new JLabel("When you pass technical inspection (all stickers) it means:"),odgovori147, "I am allowed to participate in dynamic events", null, null);
				lista_pitanja.add(q147);
				
				//PITANJE 148 -nije poslat odgovor
				List <String> odgovori148=new ArrayList<String>();
				odgovori148.add("32mm x 2.5mm round aluminium tube as front roll hoop bracing (E=70 GPa)");
				odgovori148.add("25.4mm x 2.4mm seam welded round steel tube as main hoop");
				odgovori148.add("1\" x 0.083\" seamless drawn round steel tube as shoulder harness mounting bar");
				odgovori148.add("35 mm x 1.2 mm magnesium square tube as front bulkhead support (E=44 GPa)");
				Question q148=new RadioButtonQ (new JLabel("Which of the following tubes is not allowed as the stated frame member (regardless of implementation/mounting/etc.)?"),odgovori148, "32mm x 2.5mm round aluminium tube as front roll hoop bracing (E=70 GPa)", null, null);
				//lista_pitanja.add(q148);
				
				//PITANJE 149 -
				List <String> odgovori149=new ArrayList<String>();
				odgovori149.add("An off-course occurs if a vehicle is outside the track boundary with all four wheels");
				odgovori149.add("An off-course during the skipad event leads to DNF for that run");
				odgovori149.add("An off-course occurs if a slalom gate is missed");
				odgovori149.add("An off-course can be avoided if the driver re-enters the track at or before the point he left it");
				odgovori149.add("The time penalty for an off-course in 10s");
				Question q149=new RadioButtonQ (new JLabel("What is false regarding an Off-Course (OC) during endurance?"),odgovori149, "The time penalty for an off-course in 10s", null, null);
				lista_pitanja.add(q149);
				
				//PITANJE 150 -
				List <String> odgovori150=new ArrayList<String>();
				odgovori150.add("Doing the on-site team registration");
				odgovori150.add("Officially receiving trophies during the award ceremony");
				odgovori150.add("none");
				odgovori150.add("Accompanying the team's car through scrutineering");
				Question q150=new RadioButtonQ (new JLabel("What are the responsibilities of the faculty advisor at FSA?"),odgovori150, "none", null, null);
				//lista_pitanja.add(q150);
				
				//PITANJE 151 -
				List <String> odgovori151=new ArrayList<String>();
				odgovori151.add("Four");
				odgovori151.add("Three");
				odgovori151.add("Five");
				odgovori151.add("Six");
				odgovori151.add("Unlimited, but the number of drivers per event is limited to two");
				odgovori151.add("Unlimited, but the number of events per driver is limited to two");
				Question q151=new RadioButtonQ (new JLabel("How many drivers per team are allowed at most?"),odgovori151, "Six", null, null);
				//lista_pitanja.add(q151);
				
				//PITANJE 152 -
				List <String> odgovori152=new ArrayList<String>();
				odgovori152.add("Boring the Engine");
				odgovori152.add("Using a different-length conrod");
				odgovori152.add("Changing the head gasket to a thicker one");
				odgovori152.add("Machining the piston's valve pockets");
				odgovori152.add("Stroking the Engine");
				odgovori152.add("Changing the inlet cam geometry");
				Question q152=new RadioButtonQ (new JLabel("Which of the following will not alter the geometric compression raito?"),odgovori152, "Using a different-length conrod", null, null);
				//lista_pitanja.add(q152);
				
				//PITANJE 153 -
				List <String> odgovori153=new ArrayList<String>();
				odgovori153.add("Depends on the fourth place score");
				odgovori153.add("80 points");
				odgovori153.add("There is no lower bound");
				odgovori153.add("70 points");
				odgovori153.add("73 points");
				odgovori153.add("71 points");
				Question q153=new RadioButtonQ (new JLabel("What is the minimum score for the third place in the Business Plan finals (with three finalists)?"),odgovori153, "71 points", null, null);
				lista_pitanja.add(q153);
				
				//PITANJE 154 -nije poslat odgovor
				List <String> odgovori154=new ArrayList<String>();
				odgovori154.add("30.5g");
				odgovori154.add("51.0g");
				odgovori154.add("38.2g");
				odgovori154.add("2.6g");
				odgovori154.add("10.2g");
				Question q154=new RadioButtonQ (new JLabel("<html>The Frontwing of your car is attached to the frontbulkhead using four 8mm dowel pins in single shear. <br/>What is the maximum allowed deceleration peak in the impact attenuator test if you are testing without the frontwing and its mounting? <br/>(T2.20.3/Method b) (tmax(Pin)=150 N/mm2)</html>"),odgovori154, "30.5g", null, null);
				//lista_pitanja.add(q154);
				
				//PITANJE 155 -
				List <String> odgovori155=new ArrayList<String>();
				odgovori155.add("Either the team captain or faculty advisor");
				odgovori155.add("The faculty advisor");
				odgovori155.add("Any team member familiar with the vehicle and tech inspection");
				odgovori155.add("The person completing this quiz");
				odgovori155.add("The team captain");
				Question q155=new RadioButtonQ (new JLabel("During the tech inspection, the vehicle has to be acoompanied by the 'Inspection Responsible Person', who has to be:"),odgovori155, "Any team member familiar with the vehicle and tech inspection", null, null);
				lista_pitanja.add(q155);
				
				//PITANJE 156 -
				List <String> odgovori156=new ArrayList<String>();
				odgovori156.add("605cc V-Twin, High-Pressure Direct injection");
				odgovori156.add("705cc Single, Radial Compressor & Recirculation valve");
				odgovori156.add("1100cc inline-4, 2 Turbos /w Pop-Off valves");
				odgovori156.add("550cc Inline, N/A, with individual throttles at the intake ports");
				Question q156=new RadioButtonQ (new JLabel("Which engine is illegal?"),odgovori156, "1100cc inline-4, 2 Turbos /w Pop-Off valves", null, null);
				//lista_pitanja.add(q156);
				
				//PITANJE 157 Madjarska 2018 -
				List <String> odgovori157=new ArrayList<String>();
				odgovori157.add("The quick jack must have red color");
				odgovori157.add("An approved fire extinguisher (see T12.4.1) must be mounted to the quick jack such that it is quickly accessible.");
				odgovori157.add("The jacking point must be visible to a person standing 1 meter behind the car.");
				odgovori157.add("The quick jack must be presented during technical inspection.");
				odgovori157.add("The quick jack must lif the car so that the lowest point of the car is min. 100mm off the ground.");
				Question q157=new RadioButtonQ (new JLabel("<html>Which statements apply on the Vickers hardness test method?</html>"),odgovori157, "The jacking point must be visible to a person standing 1 meter behind the car.", null, null);
				//lista_pitanja.add(q157);
				
				//PITANJE 158 -
				List <String> odgovori158=new ArrayList<String>();
				odgovori158.add("0,35 [m]");
				odgovori158.add("0,25 [m]");
				odgovori158.add("0,3 [cm]");
				odgovori158.add("0,03 [m]");
				Question q158=new RadioButtonQ (new JLabel("What is the minimum permitted static ground clearance of the vehicle, including the driver?"),odgovori158, "0,03 [m]", null, null);
				//lista_pitanja.add(q158);
				
				//PITANJE 159 -
				List <String> odgovori159=new ArrayList<String>();
				odgovori159.add("115,4 [mm]");
				odgovori159.add("109,1 [mm]");
				odgovori159.add("85,4 [mm]");
				odgovori159.add("203,8 [mm]");
				Question q159=new RadioButtonQ (new JLabel("<html>What is the height of the measurement tool, that is used to check the allowable <br/> deflection in the load carrying direction at aerodynamic devices. The applied material for the tool is S235JR.</html>"),odgovori159, "115,4 [mm]", null, null);
				lista_pitanja.add(q159);
				
				//PITANJE 160 -
				List <String> odgovori160=new ArrayList<String>();
				odgovori160.add("103 dBb");
				odgovori160.add("110 dB");
				odgovori160.add("110 dBc");
				odgovori160.add("103 dBc");
				Question q160=new RadioButtonQ (new JLabel("What is the maximum permitted sound pressure limit during a noise test, at idle engine speed, to pass the test?"),odgovori160, "103 dBc", null, null);
				lista_pitanja.add(q160);
				
				//PITANJE 161 -
				List <String> odgovori161=new ArrayList<String>();
				odgovori161.add("587,5 [N]");
				odgovori161.add("1043,6 [N]");
				odgovori161.add("763,6 [N]");
				odgovori161.add("5763,4 [N]");
				Question q161=new RadioButtonQ (new JLabel("<html>When the velocity of the vehicle is 126 [km/h], <br/>the normal load on the tyre conact surface is double compared to load when it stands (v=0). <br/>Calculate the drag force acting on the vehicle at this velocity if its lif-to-drag ratio is 2,35 [-] and its mass is 250 [kg] (g=9,81 m/s2)</html>"),odgovori161, "1043,6 [N]", null, null);
			//	lista_pitanja.add(q161);
				
				//PITANJE 162 -
				List <String> odgovori162=new ArrayList<String>();
				odgovori162.add("2 deg.");
				odgovori162.add("5 deg.");
				odgovori162.add("7 deg.");
				odgovori162.add("10 deg.");
				Question q162=new RadioButtonQ (new JLabel("What is the amount of the maximum allowable free play of the steering system measured on the steering wheel?"),odgovori162, "7 deg.", null, null);
				lista_pitanja.add(q162);
				
				//PITANJE 163 -
				List <String> odgovori163=new ArrayList<String>();
				odgovori163.add("ESF");
				odgovori163.add("SES");
				odgovori163.add("DSS");
				odgovori163.add("All three mentioned");
				Question q163=new RadioButtonQ (new JLabel("Which of the following documents is directly evaluated during Engineering Design Event?"),odgovori163, "DSS", null, null);
				//lista_pitanja.add(q163);
				
				//PITANJE 164 -
				List <String> odgovori164=new ArrayList<String>();
				odgovori164.add("USD (US Dollar)");
				odgovori164.add("In the team's national currency");
				odgovori164.add("HUF (Hungarian Forint)");
				odgovori164.add("EUR (Euro)");
				Question q164=new RadioButtonQ (new JLabel("In which currency must the costs be displayed in the CBOM?"),odgovori164, "EUR (Euro)", null, null);
				lista_pitanja.add(q164);
				
				//PITANJE 165 -nije poslat odgovor
				List <String> odgovori165=new ArrayList<String>();
				odgovori165.add("23");
				odgovori165.add("28");
				odgovori165.add("26");
				odgovori165.add("18");
				Question q165=new RadioButtonQ (new JLabel("What is the minimum number of the tubes in the Primary Structure in case of tube frame?"),odgovori165, "23", null, null);
				//lista_pitanja.add(q165);
				
				//PITANJE 166 -
				List <String> odgovori166=new ArrayList<String>();
				odgovori166.add("Dynamic events are scored separately, but static ones are scored together");
				odgovori166.add("CV & EV are scored together, but DV is scored separately");
				odgovori166.add("All three caregories are scored together");
				odgovori166.add("All three categories are scored completely separately");
				Question q166=new RadioButtonQ (new JLabel("Scoring at FS East 2018: which is true?"),odgovori166, "All three categories are scored completely separately", null, null);
				lista_pitanja.add(q166);
				
				//PITANJE 167 -
				List <String> odgovori167=new ArrayList<String>();
				odgovori167.add("30 [m/s]");
				odgovori167.add("120 [km/h]");
				odgovori167.add("135 [km/h]");
				odgovori167.add("105 [km/h]");
				Question q167=new RadioButtonQ (new JLabel("<html>Our vehicle completes the Acceleration Event with 4[s] result. <br/>What is its velocity when it crosses the finish line, if we assume, that its acceleration is constant during the run?</html>"),odgovori167, "120 [km/h]", null, null);
				//lista_pitanja.add(q167);
				
				//PITANJE 168 -
				List <String> odgovori168=new ArrayList<String>();
				odgovori168.add("900000 [mm3]");
				odgovori168.add("90 [cm3]");
				odgovori168.add("1100 [cm3]");
				odgovori168.add("900000 [cm3]");
				odgovori168.add("110000 [mm3]");
				Question q168=new RadioButtonQ (new JLabel("What is the minimum volume of the head restraint?"),odgovori168, "90 [cm3]", null, null);
				//lista_pitanja.add(q168);
				
				//PITANJE 169 - 
				List <String> odgovori169=new ArrayList<String>();
				odgovori169.add("Systems > Assemblies > Subassemblies > Parts & Fasteners > Materials & Processes");
				odgovori169.add("Systems > Parts > Materials & Processes > Tooling & Fasteners");
				odgovori169.add("Assemblies > Subassemblies > Parts > Materials & Processes > Tooling & Fasteners");
				odgovori169.add("Systems > Assemblies > Parts > Materials & Processes > Tooling & Fasteners");
				Question q169=new RadioButtonQ (new JLabel("What is the proper structure of the BOM?"),odgovori169, "Systems > Assemblies > Subassemblies > Parts & Fasteners > Materials & Processes", null, null);
				//lista_pitanja.add(q169);
				
				//PITANJE 170 -
				List <String> odgovori170=new ArrayList<String>();
				odgovori170.add("60,8 points");
				odgovori170.add("59 points");
				odgovori170.add("57,6 points");
				odgovori170.add("67 points");
				Question q170=new RadioButtonQ (new JLabel("<html>Suppose that 28 teams participate in the CV category on FS East 2018 and your team is one of them, <br/>there are 6 Business Finalist teams among them. The team with the highest points not reaching the finals has 67 points <br/> your team recieved 59 points. What is your Business Plan Presentation Score?<html>"),odgovori170, "60,8 points", null, null);
				lista_pitanja.add(q170);
				
				//PITANJE 171 //Austria 2018 -
				List <String> odgovori171=new ArrayList<String>();
				odgovori171.add("no penalty if the team is able to start their run at a later time slot (e.g. at the end of endurance event)");
				odgovori171.add("10 s penalty on the endurance time for each (following) time slot taht is missed");
				odgovori171.add("50 points penalty");
				odgovori171.add("200 s penalty on the endurance time");
				odgovori171.add("2 min penalty on the endurance time");
				Question q171=new RadioButtonQ (new JLabel("What is the penalty for not being ready to drive in the endurance at your designated time slot?"),odgovori171, "2 min penalty on the endurance time", null, null);
				lista_pitanja.add(q171);
				
				//PITANJE 172 -
				List <String> odgovori172=new ArrayList<String>();
				odgovori172.add("you will recieve 60 points penalty");
				odgovori172.add("you will recieve 44 points penalty");
				odgovori172.add("a 30 sec penalty on your endurance time because it is a violation without advantage for the team");
				odgovori172.add("no penalty because it is a violation without advantage for the team (only lower weight will result in a penalty)");
				Question q172=new RadioButtonQ (new JLabel("In the parc ferme your car weight is 7.3 kg higher than the weight determined during the technical inspection. What consequences does your team have to expect?"),odgovori172, "you will recieve 60 points penalty", null, null);
				lista_pitanja.add(q172);
				
				//PITANJE 173 - duplo pitanje
				List <String> odgovori173=new ArrayList<String>();
				odgovori173.add("705cc Signle, Radial Compressor & Recirculation valve");
				odgovori173.add("1100 cc Inline-4, Turbos /w Pop-Off Valve");
				odgovori173.add("550 cc Inline-4, N/A, with variable CAM timing and single Electronic Barrel Throttle");
				odgovori173.add("605 cc V-Twin, High-Pressure Direct Injection");
				Question q173=new RadioButtonQ (new JLabel("Which of the following engines is not compativle with the rules?"),odgovori173, "1100 cc Inline-4, Turbos /w Pop-Off Valve", null, null);
				//lista_pitanja.add(q173);
				
				//PITANJE 174
				List <String> odgovori174=new ArrayList<String>();
				odgovori174.add("the template for the UK business logic case can be used");
				odgovori174.add("The Executive SUmmary is part of the Business Presentation Judging");
				odgovori174.add("the name of the University must be given");
				odgovori174.add("the number of the team has to be in the right top corner");
				odgovori174.add("a picture of the car has to be included");
				Question q174=new RadioButtonQ (new JLabel("What is not true for the business plan executive summary?"),odgovori174, "the template for the UK business logic case can be used", null, null);
				//lista_pitanja.add(q174);
				
				//PITANJE 175
				List <String> odgovori175=new ArrayList<String>();
				odgovori175.add("using motorized scooters on the event site is forbidden");
				odgovori175.add("only handheld tools operating below 60V (the maximum permitted voltage for your car) are allowed");
				odgovori175.add("Even team members that are only assisting must wear eye protection during metal cutting");
				odgovori175.add("Hearing protection when using loud tools is only recommended");
				odgovori175.add("visitors watching dynamic events must wear closed-toed shoes");
				Question q175=new RadioButtonQ (new JLabel("Which statements concerning personal safety on the event site is correct?"),odgovori175, "using motorized scooters on the event site is forbidden", null, null);
				//lista_pitanja.add(q175);
				
				//PITANJE 176
				List <String> odgovori176=new ArrayList<String>();
				odgovori176.add("Fuel tanks must be FIA FT3/1999 or NHRA approved");
				odgovori176.add("If the fuel tank is made from a flexible material, the car may be manipulated during refueling to ensure it is filled to capacity");
				odgovori176.add("The filler neck may be made from transparent material such as glass");
				odgovori176.add("Hose clamps are only allowed for material braid fuel hoses");
				odgovori176.add("any fuel spills that occur during engine operation must be routed into a catch tank");
				Question q176=new RadioButtonQ (new JLabel("Which requirement, concerning the fuel system, is true?"),odgovori176, "Fuel tanks must be FIA FT3/1999 or NHRA approved", null, null);
				//lista_pitanja.add(q176);
				
				//PITANJE 177
				List <String> odgovori177=new ArrayList<String>();
				odgovori177.add("If not welded to a steel chasis, the attachment must support a load of 13kN (given that this mounting point is used only for the lap belt)");
				odgovori177.add("the lap belts must be releasable by separate release mechanisms");
				odgovori177.add("The belt must be 75 mm wide, except with the use of a HANS device");
				odgovori177.add("If the belt passes through a firewall, the edges must be sealed by a grommet and it has to be protected against chafing");
				Question q177=new RadioButtonQ (new JLabel("Which requirement, concerning the lap belt, is true?"),odgovori177, "If not welded to a steel chasis, the attachment must support a load of 13kN (given that this mounting point is used only for the lap belt)", null, null);
				//lista_pitanja.add(q177);
				
				//PITANJE 178 - Austria 2019
				Question q178=new AnswerBoxQ (new JLabel("Your team's best runtime is 6.25s, the overall best time is 5s. How many points do you score? (Please use following format 12.34)"),null, "3.5", null, null);
				lista_pitanja.add(q178);
				
				//PITANJE 179 -
				List <String> odgovori179=new ArrayList<String>();
				odgovori179.add("The brake test is considered passed if the BOTS has opened the shutdown circuit as long as all wheels have locked up and the vehicle stopped in a straight line");
				odgovori179.add("It has to be wired in parallel to the inertia switch as part of the shutdown system");
				odgovori179.add("It may be reset by the driver when he comes to a stop for the endurance drivers' change");
				odgovori179.add("It has to open the shutdown circuit if there is a leak in the rear braking circuit, even if the balance bar is seto to 80% front");
				Question q179=new RadioButtonQ (new JLabel("What is true regarding the Brake Over-Travel Switch (BOTS)?"),odgovori179, "It has to open the shutdown circuit if there is a leak in the rear braking circuit, even if the balance bar is seto to 80% front", null, null);
				//lista_pitanja.add(q179);
				
				//PITANJE 180 -
				List <String> odgovori180=new ArrayList<String>();
				odgovori180.add("The BSPD must be supplied from the low voltage master switch only");
				odgovori180.add("Above a brake pressure of 20 bar the car traction system will shut down anyway");
				odgovori180.add("At the earliest the car traction system will shut down after one second");
				odgovori180.add("Above a brake pressure of 30 bar the car traction system will shut down if 4kW power is delivered to the electric motors (EV) or the throttle position is more than 5% over idle position (CV)");
				Question q180=new RadioButtonQ (new JLabel("Your driver pushes the brake predal and the accelerator pedal at the same time. Which statement is correct?"),odgovori180, "The BSPD must be supplied from the low voltage master switch only", null, null);
				//lista_pitanja.add(q180);
				
				//PITANJE 181 -
				List <String> odgovori181=new ArrayList<String>();
				odgovori181.add("Combustion up to 25mm before the holding clamp");
				odgovori181.add("Flame height = 21mm");
				odgovori181.add("First flame application time = 10s, first burning time = 5s, second flame application time = 10s, second burning time = 9s");
				odgovori181.add("First flame application time = 10s, first burning time = 9s, second flame application time = 10s, second burning time = 8s, the total burning time of all 10 flame applications in the set did not exceed 45s");
				odgovori181.add("Dripping of burning specimens including ignition of cotton batting");
				Question q181=new RadioButtonQ (new JLabel("UL94-V0 rating cannot be granted if..."),odgovori181, "Dripping of burning specimens including ignition of cotton batting", null, null);
				lista_pitanja.add(q181);
				
				//PITANJE 182 -
				List <String> odgovori182=new ArrayList<String>();
				odgovori182.add("All aerodynamic devices must be able to withstand a force of 150 N distributed over a certain surface");
				odgovori182.add("A rear wing rearward of the driver head restraint is permitted if it's lower than 0.9 m from the ground");
				odgovori182.add("Aerodynamic devices mounted forward than 800 mm from the fronts of the front tire are prohibited");
				odgovori182.add("All aerodynamic devices in front of the front axle and extending further outboard than the most inboard point of the front tire/wheel must be higher than 250 mm from the Ground");
				Question q182=new RadioButtonQ (new JLabel("Concerning aerodynamic devices which statement is not compliant to the rules?"),odgovori182, "All aerodynamic devices in front of the front axle and extending further outboard than the most inboard point of the front tire/wheel must be higher than 250 mm from the Ground", null, null);
				lista_pitanja.add(q182);
				
				//PITANJE 183 -
				List <String> odgovori183=new ArrayList<String>();
				odgovori183.add("45 deg. turn with a diameter of 20 m and a track width of 2.75 m");
				odgovori183.add("Hairpin turn with an inner diameter of 6 m and a track width of 3.5 m");
				odgovori183.add("Slalom with constant spacing of 10 m");
				odgovori183.add("Straight with a length of 70 m and a track width of 4 m");
				Question q183=new RadioButtonQ (new JLabel("You build an AutoX track on your testing ground. Which elements are not conformant to the rules?"),odgovori183, "45 deg. turn with a diameter of 20 m and a track width of 2.75 m", null, null);
				lista_pitanja.add(q183);
				
				//PITANJE 184 -
				List <String> odgovori184=new ArrayList<String>();
				odgovori184.add("The shutdown buttons must connected in series to the low woltage master switch");
				odgovori184.add("The buttons must be clearly marked by the international electric symbol");
				odgovori184.add("The minimum diameter of the cockpit mounted shutdown button is 24 mm");
				odgovori184.add("At a minimum, two shutdown buttons must be installed");
				Question q184=new RadioButtonQ (new JLabel("Which statement regarding the shutdown buttons is false?"),odgovori184, "The shutdown buttons must connected in series to the low woltage master switch", null, null);
				//lista_pitanja.add(q184);

				//PITANJE 185 -
				List <String> odgovori185=new ArrayList<String>();
				odgovori185.add("Fuel that is spilled during refueling must be directed into a catch can with at least 900ml volume");
				odgovori185.add("The vent of a separate hydraulic shifting system must be connected to the engine oil catch can");
				odgovori185.add("Engine oil that leaks from a broken seal must be catched by an undertray to prevent oil spills on the track and environmental pollution");
				odgovori185.add("If there is more than one local lowest point in the enclosed structure between the chassis and the ground, a minimum of 3 venting holes is necessary");
				Question q185=new RadioButtonQ (new JLabel("What is true regarding the management of unintentionally spilled fluids?"),odgovori185, "If there is more than one local lowest point in the enclosed structure between the chassis and the ground, a minimum of 3 venting holes is necessary", null, null);
				lista_pitanja.add(q185);
				
				//PITANJE 186 -
				List <String> odgovori186=new ArrayList<String>();
				odgovori186.add("Holes in the container are only allowed if they are necessary for the venting of explosive gas");
				odgovori186.add("Fasteners to attach pouch cells to the container must comply with rule T10");
				odgovori186.add("The mounting of the accumulator cells to the container must withstand 40 g acceleration in vertical direction");
				odgovori186.add("Vertical walls must be made from steel 0.9 mm thick of aluminium 2.3 mm thick only");
				Question q186=new RadioButtonQ (new JLabel("What is true regarding the mechanical configuration of the tractive system energy storage?"),odgovori186, "Fasteners to attach pouch cells to the container must comply with rule T10", null, null);
				lista_pitanja.add(q186);
				
				//PITANJE 187 -
				List <String> odgovori187=new ArrayList<String>();
				odgovori187.add("The activation of the shutdown circuit occurs at max 1s after the TS wiring is damaged");
				odgovori187.add("The shutdown circuit is activated if the TS wiring is damaged");
				odgovori187.add("TS wiring will not touch the chassis regardless of where it is damaged");
				odgovori187.add("The TS wiring is of a length enough not to be damaged even if the wheel is displaced (e.g. break of a tie rod)");
				Question q187=new RadioButtonQ (new JLabel("Under which conditions are outboard wheel motors allowed?"),odgovori187, "The shutdown circuit is activated if the TS wiring is damaged", null, null);
				lista_pitanja.add(q187);
				
				//PITANJE 188 -
				List <String> odgovori188=new ArrayList<String>();
				odgovori188.add("The sound level is measured in dBC");
				odgovori188.add("No animal voices may be used");
				odgovori188.add("The ready to drive sound must be 4s long, with a tolerance of +/- 0.25s");
				odgovori188.add("A sound level of 85 dBA is conformant to the rules");
				Question q188=new RadioButtonQ (new JLabel("Which statement regarding the Ready to drive sound is true?"),odgovori188, "A sound level of 85 dBA is conformant to the rules", null, null);
				lista_pitanja.add(q188);
				
				//PITANJE 189 -
				
				Question q189=new AnswerBoxQ (new JLabel("<html>Your battery pack is built from 4 Stacks of 103 Cells each(103S4P).<br/> Each stack has a capacity of 1.20 kWh and an internal resistance of 320 mOhm.<br/> If all cells are charged & balanced to 3.80 V and behave equally, which current do you draw at 30 kW power output from the pack? <br/>(Answer in [A] rounded to .1)<br/><br/> (Please use the following format: 12.34)</html>"),null, "77.9", null, null);
				lista_pitanja.add(q189);
				
				//PITANJE 190 -
				Question q190=new AnswerBoxQ (new JLabel("Your car constantly accelerates with 10 m/s2. <br/>After 10 meters your engine / motor(s) die and deliver no power anymore. <br/>Your car then constantly decelerates with 0.2 m/s2. How far do you make it from the start? Answer in whole [m].<br/> Please use following format: 12.34"),null, "5.1", null, null);
				//lista_pitanja.add(q190);
				
				//PITANJE 191 // Nizozemska 2019 Folder prvi put -nije poslat odgovor
				List <String> odgovori191=new ArrayList<String>();
				odgovori191.add("315 GPa");
				odgovori191.add("135 GPa");
				odgovori191.add("280 GPa");
				odgovori191.add("220 GPa");
				odgovori191.add("180 GPa");
				Question q191=new RadioButtonQ (new JLabel("What will Young's Modulus be for a 20 mm square bar and with a length of 600mm when it lengthens by 0.5 mm under a load of 45 kN?"),odgovori191, "315 GPa", null, null);
				//lista_pitanja.add(q191);
				
				//PITANJE 192 -nije poslat odgovor
				List <String> odgovori192=new ArrayList<String>();
				odgovori192.add("You have submitted a group B document 196 hours after the deadline");
				odgovori192.add("You have submitted a group B document 122 hours after the deadline");
				odgovori192.add("You have failed to submit a corrected group A document 396 hours after the correction request");
				odgovori192.add("You have failed to submit a corrected group B document 322 hours after the correction request");
				Question q192=new RadioButtonQ (new JLabel("You have just found out that your team is de-registered from the competition. On what ground could this have happened?"),odgovori192, "You have submitted a group B document 196 hours after the deadline", null, null);
				//lista_pitanja.add(q192);
				
				//PITANJE 193
				ImageIcon slika19icon=new ImageIcon("sources/slika19.png");
				JLabel slika19=new JLabel(slika19icon);
				Question q193=new AnswerBoxQ(new JLabel(""),null, "1.0", slika19, null);
				//lista_pitanja.add(q193);
				
				//PITANJE 194
				ImageIcon slika20icon=new ImageIcon("sources/slika20.png");
				JLabel slika20=new JLabel(slika20icon);
				Question q194=new AnswerBoxQ (new JLabel(""),null, "2.5", slika20, null);
				lista_pitanja.add(q194);
				/*
				//PITANJE 195 -nije poslat odgovor
				List <String> odgovori195=new ArrayList<String>();
				odgovori195.add("60 mm");
				odgovori195.add("100 mm");
				odgovori195.add("25 mm");
				odgovori195.add("0 mm");
				odgovori195.add("50 mm");
				Question q195=new RadioButtonQ (new JLabel("<html>What is the maximum vertical distance allowed between the lowest part of the front hoop and the lowest part of the diagonal bracing <br/> in the front bulkhead support when the diagonal bracing is attached at the top at the FBH?</html>"),odgovori195, "60 mm", null, null);
				lista_pitanja.add(q195);
				
				//PITANJE 196 -nije poslat odgovor 
				List <String> odgovori196=new ArrayList<String>();
				odgovori196.add("3 cones");
				odgovori196.add("1 cones");
				odgovori196.add("4 cones");
				odgovori196.add("2 cones");
				odgovori196.add("5 cones");
				Question q196=new RadioButtonQ (new JLabel("<html>Your team set the fastest lap time at the Autocross event with a time of 86,3 seconds on your first and only run. <br/>However, on the final scoring sheet your team is listed in fifth place with 73,1 out of 100 points,<br/> while the new winner of the event has a corrected elapsed time of 87,1 seconds. <br/>How many cones did your team knock down or out?</html>"),odgovori196, "3 cones", null, null);
				lista_pitanja.add(q196);
				
				//PITANJE 197 -nije poslat odgovor
				List <String> odgovori197=new ArrayList<String>();
				odgovori197.add("180 kg");
				odgovori197.add("220 kg");
				odgovori197.add("200 kg");
				odgovori197.add("160 kg");
				Question q197=new RadioButtonQ (new JLabel("<html>During the brake test, your driver fails to lock the wheels, but vehicle comes to a complete stop. <br/>After analyzing  the results you have the following data: <br/>Vehicle speed before braking point: 54 km/h. <br/>Distance between braking point and complete stop: 15 m. <br/>Time between braking point and complete stop: 2s. <br/>Resultant force during braking: 1350 N. What is mass of your vehicle?</html>"),odgovori197, "180 kg", null, null);
				lista_pitanja.add(q197);
				
				//PITANJE 198 -nije poslat odgovor
				List <String> odgovori198=new ArrayList<String>();
				odgovori198.add("Yes");
				odgovori198.add("No, only titanium is allowed for these brackets");
				odgovori198.add("Yes, but only if the new brackets are machined");
				odgovori198.add("No, only steel is allowed for these brackets");
				Question q198=new RadioButtonQ (new JLabel("To save weight, you have decided to replace the steel brackets for the brake pedal mounting for new aluminum ones. Is this allowed by the rules?"),odgovori198, "Yes", null, null);
				lista_pitanja.add(q198);
				
				//PITANJE 199 -nije poslat odgovor
				List <String> odgovori199=new ArrayList<String>();
				odgovori199.add("6.6667");
				odgovori199.add("0.176");
				odgovori199.add("0.15");
				odgovori199.add("0.85");
				odgovori199.add("0.45");
				odgovori199.add("5.6667");
				Question q199=new RadioButtonQ (new JLabel("<html>A heat pump with a pump of 150W and is adding heat to a hot reservoir with a rate of 1000 J/s. <br/>If that heat pump was used for cooling what would its coefficiency of cooling be? Assume everything works ideally under perfect conditions.</html>"),odgovori199, "6.6667", null, null);
				lista_pitanja.add(q199);
				
				//PITANJE 200 -nije poslat odgovor
				List <String> odgovori200=new ArrayList<String>();
				odgovori200.add("The team must install a mirror on both sides of the car");
				odgovori200.add("The team must install at least one mirror on the right side of the car");
				odgovori200.add("The field of vision is compliant with the rules, no mirrors need to be installed");
				odgovori200.add("The team must install at least one mirror on the left side of the car");
				Question q200=new RadioButtonQ (new JLabel("<html>When seated normally in your car, the driver has a field of vision 210 deg. <br/>Your lead engineer decided to place the air intake on the left side of your vehicle, <br/>therefore the field is vision is different per side: 90 deg. on the left side and 120 deg. <br/>on the right side. These field of vision angles are achieved when the driver fully turns their head. <br/>What can you say about the field of vision?</html>"),odgovori200, "The team must install a mirror on both sides of the car", null, null);
				lista_pitanja.add(q200);
				
				
				//PITANJE 201 -nije poslat odgovor
				List <String> odgovori201=new ArrayList<String>();
				odgovori201.add("Yes");
				odgovori201.add("No");
				odgovori201.add("Yes, as long as this system is only used for rear-wheel steering");
				odgovori201.add("Yes, as long as the steering wheel is equipped with a quick-release system");
				Question q201=new RadioButtonQ (new JLabel("<html>One of your engineers has come up with a new design for your power-steering system. <br/>The system has less free play compared to your current solution, just 3 deg. <br/>compared to your current 5 deg. Also, the new system is likely to increase performance at the endurance event as <br/>the cable-system makes that your drivers need less force to turn the round steering wheel. Are you allowed to use the new system?</html>"),odgovori201, "Yes", null, null);
				lista_pitanja.add(q201);
				
				//PITANJE 202 -nije poslat odgovor
				List <String> odgovori202=new ArrayList<String>();
				odgovori202.add("You must have at least one hole of 10mm in diameter to vent the chassis structure, in case of any accumulation of gasses");
				odgovori202.add("You must have at least two holes of 25mm to vent the chassis structure, in case of any accumulation of gasses");
				odgovori202.add("You are not allowed to have holes in the chassis structure, other than a maintenance hole to adjust the brake pedals");
				odgovori202.add("You are not allowed to have holes in the chassis structure");
				Question q202=new RadioButtonQ (new JLabel("Assume your car has an enclosed chassis structure. What is true about holes?"),odgovori202, "You must have at least one hole of 10mm in diameter to vent the chassis structure, in case of any accumulation of gasses", null, null);
				lista_pitanja.add(q202);
				
				//PITANJE 203
				List <String> odgovori203=new ArrayList<String>();
				odgovori203.add("7,7459 m/s");
				odgovori203.add("5,897 m/s");
				odgovori203.add("5,897 km/h");
				odgovori203.add("7,7459 km/h");
				Question q203=new RadioButtonQ (new JLabel("<html>The circular Dynamic Platform at ZalaZone has 1% of slope from North to South.<br/> The diameter of the Platform is 300m. If a ball is released on the highest point of the Platform (North)<br/> from standstill state, what will be the speed of the ball at the lowest point of the Platform (South)? <br/>Consider that the ball rolls directly from the highest point to the lowest point. Rolling resistance is 0. Mass of the ball is 200g. G= 10 m/s2.</html>"),odgovori203, "7,7459 m/s", null, null) ;
				lista_pitanja.add(q203);
				
				//PITANJE 204
				List <String> odgovori204=new ArrayList<String>();
				odgovori204.add("Phase 3");
				odgovori204.add("Phase 1");
				odgovori204.add("Phase 4");
				odgovori204.add("Phase 2");
				Question q204=new RadioButtonQ (new JLabel("<html>The Zalazone Proving Ground would contain several track elements (such as Dynamic Platform, Slopes, Handling Course etc.) <br/>In which phase of the construction it is planned to contruct the High - Speed Oval Track element?</html>"),odgovori204, "Phase 3", null, null);
				lista_pitanja.add(q204);
				
				//PITANJE 205
				List <String> odgovori205=new ArrayList<String>();
				odgovori205.add("Yes, if the judges consider the vehicle to be in unfinished state");
				odgovori205.add("No, if a team is present at the event, the judges are obligated to evaluate their performance");
				odgovori205.add("Yes, if the judges consider the number of the team members present at the discussion insufficient");
				odgovori205.add("Yes, if the team did not pass any scrutineering prior");
				Question q205=new RadioButtonQ (new JLabel("<html>Can a team be eliminated from the Engineering Design Event by the judges, if every document of theirs was accepted <br/>and they are present at the Engineering Design Event?</html>"),odgovori205, "Yes, if the judges consider the vehicle to be in unfinished state", null, null);
				lista_pitanja.add(q205);
				
				//PITANJE 206
				List <String> odgovori206=new ArrayList<String>();
				odgovori206.add("In the CBOM");
				odgovori206.add("In the DBOM");
				odgovori206.add("In neither of the Cost Report Documents");
				odgovori206.add("In the Cost Explanation File");
				Question q206=new RadioButtonQ (new JLabel("In which Cost Report Document does the team need to list the research and developement costs?"),odgovori206, "In the CBOM", null, null);
				lista_pitanja.add(q206);
				
				//PITANJE 207
				List <String> odgovori207=new ArrayList<String>();
				odgovori207.add("9000");
				odgovori207.add("9300");
				odgovori207.add("9500");
				odgovori207.add("10000");
				Question q207=new RadioButtonQ (new JLabel("What is the engine test speed in RPM at noise test if the engine Bore x Stroke are 63,2 x 49 mm and the average piston speed is 922,3 m/min?"),odgovori207, "9000", null, null);
				lista_pitanja.add(q207);
				
				//PITANJE 208
				List <String> odgovori208=new ArrayList<String>();
				odgovori208.add("0.45");
				odgovori208.add("0.9");
				odgovori208.add("1.35");
				odgovori208.add("0.5");
				Question q208=new RadioButtonQ (new JLabel("<html>A car finishes the skipad event with an average laptime of 5,0 seconds. The static friction coefficient of the ground and the tire is 0,9.<br/> What was the aerodynamic downforce to weight ratio during the run? Assume, that the car is travelling on the centerline of the track. G=9.81 m/s2</html>"),odgovori208, "0.45", null, null);
				lista_pitanja.add(q208);
				
				//PITANJE 209
				List <String> odgovori209=new ArrayList<String>();
				odgovori209.add("The restrictor must be upwind of the compressor");
				odgovori209.add("The restrictor must be downwind of the throttle body");
				odgovori209.add("All the three statements are true");
				odgovori209.add("The diameter of the restrictor is 19 mm");
				Question q209=new RadioButtonQ (new JLabel("Which of the following statement is false for a turbocharged engine running on ethanol fuel?"),odgovori209, "The restrictor must be upwind of the compressor", null, null);
				lista_pitanja.add(q209);
				
				//PITANJE 210
				List <String> odgovori210=new ArrayList<String>();
				odgovori210.add("86.8");
				odgovori210.add("82.5");
				odgovori210.add("95");
				odgovori210.add("79");
				Question q210=new RadioButtonQ (new JLabel("<html>According to the FS Rules 2019, how many points will a team score eventually on the Cost and Manufacturing Event, <br/> the team is not in the final, the score awarded to a team during the initial judging is 79 points, <br/>while the highest score awarded to any team not participating in the finals is 91 points?</html>"),odgovori210, "86.8", null, null);
				lista_pitanja.add(q210);
				
				//PITANJE 211
				List <String> odgovori211=new ArrayList<String>();
				odgovori211.add("The track is slippery or something is on the racing surface that should not be there. The driver must be prepared for evasive maneuvers to avoid the situation");
				odgovori211.add("The driver must be prepared to overtake a slower car on the racing line");
				odgovori211.add("The driver must pull into the driver change area for discussion with the officials concerning an incident. A time penalty may be assessed");
				odgovori211.add("Mechanical black flag. The driver must pull ino the driver change area for a mechanical inspection of the vehicle, something has been observed that requires a closer inspection");
				Question q211=new RadioButtonQ (new JLabel("What does the yellow and red striped flag mean during Endurance and Autocross Event?"),odgovori211, "The track is slippery or something is on the racing surface that should not be there. The driver must be prepared for evasive maneuvers to avoid the situation", null, null);
				lista_pitanja.add(q211);
				
				//PITANJE 212
				List <String> odgovori212=new ArrayList<String>();
				odgovori212.add("4s");
				odgovori212.add("4.28s");
				odgovori212.add("4.56s");
				odgovori212.add("3.86s");
				Question q212=new RadioButtonQ (new JLabel("<html>Our vehicle completes the Acceleration Event. Its velocity is 126 km/h, when it crosses the finish line. <br/>How much time did it need to complete the run, if we assume, that its acceleration is constant during the run?</html>"),odgovori212, "4s", null, null);
				lista_pitanja.add(q212);
				
				//PITANJE 213
				List <String> odgovori213=new ArrayList<String>();
				odgovori213.add("Stiffness");
				odgovori213.add("Peak force at failure");
				odgovori213.add("Young modulus");
				odgovori213.add("Strength");
				Question q213=new RadioButtonQ (new JLabel("If a thin and infinitely long fibre's diameter is reduced, which of its properties from the following will increase?"),odgovori213, "Stiffness", null, null);
				lista_pitanja.add(q213);
				
				//PITANJE 214
				List <String> odgovori214=new ArrayList<String>();
				odgovori214.add("Driverless Skipad Event");
				odgovori214.add("Driverless AutoX Event");
				odgovori214.add("AutoX Event");
				odgovori214.add("Trackdrive Event");
				Question q214=new RadioButtonQ (new JLabel("Which of the following dynamic disciplines will be organized first time in 2019 at FS East?"),odgovori214, "Driverless Skipad Event", null, null);
				lista_pitanja.add(q214);
				
				//PITANJE 215
				List <String> odgovori215=new ArrayList<String>();
				odgovori215.add("0.2825 m2");
				odgovori215.add("109646 mm2");
				odgovori215.add("392146 mm2");
				odgovori215.add("0.4826 m2");
				Question q215=new RadioButtonQ (new JLabel("<html>What is the sum of the area of the cockpit opening and cockpit internal cross section template? <br/>(Consider the general cockpit internal cross section template, not the reduced height version for DV.)</html>"),odgovori215, "0.2825 m2", null, null);
				lista_pitanja.add(q215);
				
				//PITANJE 216
				List <String> odgovori216=new ArrayList<String>();
				odgovori216.add("Vehicles must be pushed at a normal walking pace by means of a red pushbar, equipped with a fire extinguisher");
				odgovori216.add("Two team members walking on either side of the vehicle");
				odgovori216.add("A registered driver wearing the required driver equipment as defined in T 13.3 except for helmet, arm restraints and balaclava having full control of steering and braking");
				odgovori216.add("Detached master switch");
				Question q216=new RadioButtonQ (new JLabel("<html> Which of the following requirements is a must for all types of vehicles, <br/> when moving the vehicle on the competition site other than on the practice or competition tracks?</html>"),odgovori216, "Detached master switch", null, null);
				lista_pitanja.add(q216);
				
				//PITANJE 217
				ImageIcon slika1icon=new ImageIcon("sources/slika1.png");
				JLabel slika1=new JLabel(slika1icon);
				Question q217=new AnswerBoxQ (new JLabel(""),null, "31", slika1, null);
				lista_pitanja.add(q217);
					*//*	
				//PITANJE 218 -
				ImageIcon slika2icon=new ImageIcon("sources/slika2.png");
				JLabel slika2=new JLabel(slika2icon);
				Question q218=new AnswerBoxQ (new JLabel(""),null, "2.2", slika2, null);
				lista_pitanja.add(q218);
				
				//PITANJE 219
				ImageIcon slika3icon=new ImageIcon("sources/slika3.png");
				JLabel slika3=new JLabel(slika3icon);
				Question q219=new AnswerBoxQ (new JLabel(""),null, "79.3", slika3, null);
				//lista_pitanja.add(q219);
						
				//PITANJE 220
				ImageIcon slika4icon=new ImageIcon("sources/slika4.png");
				JLabel slika4=new JLabel(slika4icon);
				Question q220=new AnswerBoxQ (new JLabel(""),null, "-33.7", slika4, null);
				//lista_pitanja.add(q220);
				
				//PITANJE 221
				ImageIcon slika5icon=new ImageIcon("sources/slika5.png");
				JLabel slika5=new JLabel(slika5icon);
				Question q221=new AnswerBoxQ (new JLabel(""),null, "25", slika5, null);
				//lista_pitanja.add(q221);
				
				//PITANJE 222 -
				ImageIcon slika6icon=new ImageIcon("sources/slika6.png");
				JLabel slika6=new JLabel(slika6icon);
				List <String> odgovori222=new ArrayList<String>();
				odgovori222.add("A");
				odgovori222.add("B");
				odgovori222.add("C");
				odgovori222.add("D");
				Question q222=new RadioButtonQ (new JLabel(""),odgovori222, "D", slika6, null);
				//lista_pitanja.add(q222);
				
				//PITANJE 223 -
				ImageIcon slika7icon=new ImageIcon("sources/slika7.png");
				JLabel slika7=new JLabel(slika7icon);
				Question q223=new AnswerBoxQ (new JLabel(""),null, "6.5", slika7, null);
				lista_pitanja.add(q223);
				
				//PITANJE 224 -
				ImageIcon slika8icon=new ImageIcon("sources/slika8.png");
				JLabel slika8=new JLabel(slika8icon);
				List <String> odgovori224=new ArrayList<String>();
				odgovori224.add("Yes, because the tie rods might be overloaded");
				odgovori224.add("Yes, because the nuts might be overloaded");
				odgovori224.add("Yes, because some of the nuts are loaded in the wrong direction");
				odgovori224.add("Yes, because the ceiling mounts might be overloaded");
				odgovori224.add("No, all parts are still bearing their design loads");
				Question q224=new RadioButtonQ (new JLabel(""),odgovori224, "Yes, because the nuts might be overloaded", slika8, null);
				lista_pitanja.add(q224);
				
				//PITANJE 225 -
				ImageIcon slika9icon=new ImageIcon("sources/slika9.png");
				JLabel slika9=new JLabel(slika9icon);
				Question q225=new AnswerBoxQ (new JLabel(""),null, "0.23", slika9, null);
				//lista_pitanja.add(q225);
				
				//PITANJE 226 -
				ImageIcon slika10icon=new ImageIcon("sources/slika10.png");
				JLabel slika10=new JLabel(slika10icon);
				Question q226=new AnswerBoxQ (new JLabel(""),null, "74.41 74.62", slika10, null);
				lista_pitanja.add(q226);
				
				//PITANJE 227 -
				ImageIcon slika11icon=new ImageIcon("sources/slika11.png");
				JLabel slika11=new JLabel(slika11icon);
				Question q227=new AnswerBoxQ (new JLabel(""),null, "-4.2", slika11, null);
				//lista_pitanja.add(q227);
				
				//PITANJE 228 -
				ImageIcon slika12icon=new ImageIcon("sources/slika12.png");
				JLabel slika12=new JLabel(slika12icon);
				Question q228=new AnswerBoxQ (new JLabel(""),null, "2", slika12, null);
				lista_pitanja.add(q228);
				
				//PITANJE 229 -
				ImageIcon slika13icon=new ImageIcon("sources/slika13.png");
				JLabel slika13=new JLabel(slika13icon);
				Question q229=new AnswerBoxQ (new JLabel(""),null, "451.7", slika13, null);
				//lista_pitanja.add(q229);
				
				//PITANJE 230 -
				ImageIcon slika14icon=new ImageIcon("sources/slika14.png");
				JLabel slika14=new JLabel(slika14icon);
				Question q230=new AnswerBoxQ (new JLabel(""),null, "50.34 26.55", slika14, null);
				//lista_pitanja.add(q230);
				
				//PITANJE 231 -
				ImageIcon slika15icon=new ImageIcon("sources/slika15.png");
				JLabel slika15=new JLabel(slika15icon);
				Question q231=new AnswerBoxQ (new JLabel(""),null, "2.5", slika15, null);
				//lista_pitanja.add(q231);
				
				//PITANJE 232 -
				ImageIcon slika16icon=new ImageIcon("sources/slika16.png");
				JLabel slika16=new JLabel(slika16icon);
				Question q232=new AnswerBoxQ (new JLabel(""),null, "4.8", slika16, null);
				lista_pitanja.add(q232);
				
				//PITANJE 233 -
				ImageIcon slika17icon=new ImageIcon("sources/slika17.png");
				JLabel slika17=new JLabel(slika17icon);
				Question q233=new AnswerBoxQ (new JLabel(""),null, "145.3", slika17, null);
				lista_pitanja.add(q233);
				*/
				
				//PITANJE 234
				List <String> odgovori234=new ArrayList<String>();
				odgovori234.add("30 deg.");
				odgovori234.add("45 deg.");
				odgovori234.add("60 deg.");
				odgovori234.add("90 deg.");
				Question q234=new RadioButtonQ (new JLabel("For maximum range of a projectile, the angle of projection should be:"),odgovori234, "45 deg.", null, null);
				lista_pitanja.add(q234);
		
				//PITANJE 235
				List <String> odgovori235=new ArrayList<String>();
				odgovori235.add("10");
				odgovori235.add("20");
				odgovori235.add("15");
				odgovori235.add("40");
				Question q235=new RadioButtonQ (new JLabel("A simply supported beam of 2 m span carries a triangular load of 20kN. The magnitude of maximum shear force in kN will be: "),odgovori235, "10", null, null);
				lista_pitanja.add(q235);
		
				//PITANJE 236
				List <String> odgovori236=new ArrayList<String>();
				odgovori236.add("6.7");
				odgovori236.add("93.3");
				odgovori236.add("43.3");
				odgovori236.add("50");
				Question q236=new RadioButtonQ (new JLabel("A thin cylindrical tube 100mm internal diameter and 6mm thick, is closed at the ends and is subjected to an internal pressure of 8 MN/mm2. If torsional shear stress applied to the tube is 40 MN/mm2, then the maximum shear stress in MN/m2 will be:"),odgovori236, "43.3", null, null);
				lista_pitanja.add(q236);
				
				//PITANJE 237
				ImageIcon slika21icon=new ImageIcon("sources/slika21.png");
				JLabel slika21=new JLabel(slika21icon);
				List <String> odgovori237=new ArrayList<String>();
				odgovori237.add("intake");
				odgovori237.add("intake and exhaust");
				odgovori237.add("exhaust");
				odgovori237.add("expansion");
				Question q237=new RadioButtonQ (new JLabel("Which process in IC engine is represented int he following picture?"),odgovori237, "intake and exhaust", slika21, null);
				lista_pitanja.add(q237);
				
				//PITANJE 238
				ImageIcon slika22icon=new ImageIcon("sources/slika22.png");
				JLabel slika22=new JLabel(slika22icon);
				List <String> odgovori238=new ArrayList<String>();
				odgovori238.add("20");
				odgovori238.add("40");
				odgovori238.add("10");
				odgovori238.add("30");
				Question q238=new RadioButtonQ (new JLabel(""),odgovori238, "", slika22, null);
				lista_pitanja.add(q238);
				
		
				//PITANJE 239
				ImageIcon slika23icon=new ImageIcon("sources/slika23.png");
				JLabel slika23=new JLabel(slika23icon);
				List <String> odgovori239=new ArrayList<String>();
				odgovori239.add("2 P");
				odgovori239.add("P");
				odgovori239.add("0.707 P");
				odgovori239.add("1.414 P");
				Question q239=new RadioButtonQ (new JLabel(""),odgovori239, "P", slika23, null);
				lista_pitanja.add(q239);
				
				//PITANJE 240
				ImageIcon slika24icon=new ImageIcon("sources/slika24.png");
				JLabel slika24=new JLabel(slika24icon);
				List <String> odgovori240=new ArrayList<String>();
				odgovori240.add("10 kg");
				odgovori240.add("40 kg");
				odgovori240.add("1 kg");
				odgovori240.add("4 kg");
				Question q240=new RadioButtonQ (new JLabel(""),odgovori240, "4 kg", slika24, null);
				lista_pitanja.add(q240);
				
				//PITANJE 241 - sumnjivo
				//Question q241=new AnswerBoxQ(new JLabel("<html>For the 4-cylinder, 4-stroke engine with a displacement of 3 1372cm Vh <br/>What is the specific fuel consumption? For one engine operating mode the following quantities were measured: <br/> engine speed: 5800 r/min <br/> effective motor power: 94.52 kW <br/> mean volume air flow: 3062,6 l/min <br/>  fuel consumption: 100 cm3 <br/> fuel consumption measurement interval: 17.9 <br/> mean pressure drop in the intake system: 9.4 MPa <br/> mean temperature in the intake ststem: 48C <br/> During the measurement, the ambient pressure is 989 mbar and temperature is 24 deg.C. Stoichiometric ratio of the used fuel is 14.7. Fuel density is 3 752kg/m.<br/>  Round to one decimal. </html>"),null,"285.7",null, null);
				//lista_pitanja.add(q241);
				
				//PITANJE 242
				ImageIcon slika25icon=new ImageIcon("sources/slika25.png");
				JLabel slika25=new JLabel(slika25icon);
				List <String> odgovori242=new ArrayList<String>();
				odgovori242.add("D to E");
				odgovori242.add("B to D");
				odgovori242.add("A to B");
				odgovori242.add("A to D");
				Question q242=new RadioButtonQ (new JLabel(""),odgovori242, "A to D", slika25, null);
				lista_pitanja.add(q242);
				
				//PITANJE 243
				ImageIcon slika26icon=new ImageIcon("sources/slika26.png");
				JLabel slika26=new JLabel(slika26icon);
				List <String> odgovori243=new ArrayList<String>();
				odgovori243.add("2:1:3");
				odgovori243.add("3:6:2");
				odgovori243.add("3:1:2");
				odgovori243.add("2:6:3");
				Question q243=new RadioButtonQ (new JLabel(""),odgovori243, "3:6:2", slika26, null);
				lista_pitanja.add(q243);
				
				//PITANJE 244
				ImageIcon slika27icon=new ImageIcon("sources/slika27.png");
				JLabel slika27=new JLabel(slika27icon);
				List <String> odgovori244=new ArrayList<String>();
				odgovori244.add("0.7735 rad/s2");
				odgovori244.add("54.27 rad/s2");
				odgovori244.add("-0.7735 rad/s2");
				odgovori244.add("-54.27 rad/s2");
				Question q244=new RadioButtonQ (new JLabel(""),odgovori244, "-0.7735 rad/s2", slika27, null);
				lista_pitanja.add(q244);
				
				//PITANJE 245
				ImageIcon slika28icon=new ImageIcon("sources/slika28.png");
				JLabel slika28=new JLabel(slika28icon);
				List <String> odgovori245=new ArrayList<String>();
				odgovori245.add("a,c,e, and g");
				odgovori245.add("b,d, and f");
				odgovori245.add("a,b,c, and g");
				odgovori245.add("a,b,c,d,e,f, and g");
				Question q245=new RadioButtonQ (new JLabel(""),odgovori245, "a,b,c,d,e,f, and g", slika28, null);
				lista_pitanja.add(q245);
				
				//PITANJE 246
				ImageIcon slika29icon=new ImageIcon("sources/slika29.png");
				JLabel slika29=new JLabel(slika29icon);
				List <String> odgovori246=new ArrayList<String>();
				odgovori246.add("40 rpm, clockwise");
				odgovori246.add("40 rpm, counter-clockwise");
				odgovori246.add("80 rpm, clockwise");
				odgovori246.add("80 rpm, counter-clockwise");
				Question q246=new RadioButtonQ (new JLabel(""),odgovori246, "40 rpm, counter-clockwise", slika29, null);
				lista_pitanja.add(q246);
				
				//PITANJE 247
				ImageIcon slika30icon=new ImageIcon("sources/slika30.png");
				JLabel slika30=new JLabel(slika30icon);
				List <String> odgovori247=new ArrayList<String>();
				odgovori247.add("5.14N");
				odgovori247.add("4.91N");
				odgovori247.add("6.41N");
				odgovori247.add("5.66N");
				Question q247=new RadioButtonQ (new JLabel(""),odgovori247, "5.66N", slika30, null);
				lista_pitanja.add(q247);
				
				//PITANJE 248
				ImageIcon slika31icon=new ImageIcon("sources/slika31.png");
				JLabel slika31=new JLabel(slika31icon);
				List <String> odgovori248=new ArrayList<String>();
				odgovori248.add("24");
				odgovori248.add("-24");
				odgovori248.add("26");
				odgovori248.add("-26");
				Question q248=new RadioButtonQ (new JLabel(""),odgovori248, "-24", slika31, null);
				lista_pitanja.add(q248);
				
				//PITANJE 249
				ImageIcon slika32icon=new ImageIcon("sources/slika32.png");
				JLabel slika32=new JLabel(slika32icon);
				List <String> odgovori249=new ArrayList<String>();
				odgovori249.add("0,09 mm");
				odgovori249.add("0.03 mm");
				odgovori249.add("0.02 mm");
				odgovori249.add("0.05 mm");
				Question q249=new RadioButtonQ (new JLabel(""),odgovori249, "0.09 mm", slika32, null);
				lista_pitanja.add(q249);
				
				//PITANJE 250
				List <String> odgovori250=new ArrayList<String>();
				odgovori250.add("80.38 J");
				odgovori250.add("100.02 J");
				odgovori250.add("320 J");
				odgovori250.add("300 J");
				Question q250=new RadioButtonQ (new JLabel("<html>A Carnot engine absorbs 300J of heat from a reservoir <br/> at the temperature of the normal boiling point of water <br/> and rejects heat to a reservoid at the temperature of the <br/> tripple point of water. The work done by the engine is: </html>"),odgovori250, "80.38 J", null, null);
				lista_pitanja.add(q250);
				
				//PITANJE 251
				List <String> odgovori251=new ArrayList<String>();
				odgovori251.add("Cetane number");
				odgovori251.add("Octane number");
				odgovori251.add("Calorific value");
				odgovori251.add("All of these");
				Question q251=new RadioButtonQ (new JLabel("The ignition quality of petrol is expressed by:"),odgovori251, "Octane number", null, null);
				lista_pitanja.add(q251);
				
				//PITANJE 252
				List <String> odgovori252=new ArrayList<String>();
				odgovori252.add("11.21 m/s");
				odgovori252.add("15.873 m/s");
				odgovori252.add("13.867 m/s");
				odgovori252.add("12.363 m/s");
				Question q252=new RadioButtonQ (new JLabel("<html>A 40cm diameter pipe, conveying water, branches into two pipes of diameter 20cm <br/> and 15 cm respectively. If the average velocity in the 40cm diameter pipe and 20cm diameter pipe <br/> are 3.0 m/s and 4.2 m/s respectively then the velocity in 15cm diameter pipe will be: </html>"),odgovori252, "13.867 m/s", null, null);
				lista_pitanja.add(q252);
				
				//PITANJE 253
				List <String> odgovori253=new ArrayList<String>();
				odgovori253.add("4");
				odgovori253.add("0.5");
				odgovori253.add("2");
				odgovori253.add("Not possible");
				Question q253=new RadioButtonQ (new JLabel("A gas weighs 19.62 N/m3 at 25 deg.C. The density of the gas in kg/m3 will be:"),odgovori253, "13.867 m/s", null, null);
				lista_pitanja.add(q253);
				
				
				//PITANJE 254
				Question q254=new AnswerBoxQ(new JLabel("<html>Time keeping has registered a total time of 21,10 min for the fastest endurance vehicle <br/> but it knocked 3 cones (DOO). Our team as a total time of 25min but <br/> we knocked 3 cones (DOO) and we did 2 off-course (OC). <br/> What is the difference between our endurace score with included penalties and enduracne score when penalties are not included? </html>"),null,"9.91",null, null);
				lista_pitanja.add(q254);
				
				//PITANJE 255
				Question q255=new AnswerBoxQ(new JLabel("What category in engineering design gives you least points?"),null,"Engineering Design Report",null, null);
				lista_pitanja.add(q255);
				
				//PITANJE 256
				Question q256=new AnswerBoxQ(new JLabel("<html> A best time registered for acceleration event is 9s, and no cones were knocked.  <br/> Our team time for acceleration event was 12s, however we knocked 1 cone (DOO). <br/> What is our acceleration score?</html>"),null,"0",null, null);
				lista_pitanja.add(q256);
				
				//PITANJE 257
				List <String> odgovori257=new ArrayList<String>();
				odgovori257.add("When the push bar is attached to the vehicle, the engine may remain switched off.");
				odgovori257.add("When the push bar is attached to the vehicle, the engine must remain switched on.");
				odgovori257.add("When the push bar is attached to the vehicle, the engine must remain switched off.");
				Question q257=new RadioButtonQ (new JLabel("Which statement is true?"),odgovori257, "When the push bar is attached to the vehicle, the engine must remain switched off.", null, null);
				lista_pitanja.add(q257);
				
				//PITANJE 258
				List <String> odgovori258=new ArrayList<String>();
				odgovori258.add("With octane number = 95.");
				odgovori258.add("With octane number = 98.");
				odgovori258.add("With cetane number = 98.");
				odgovori258.add("With cetane number = 100.");
				Question q258=new RadioButtonQ (new JLabel("Allowed fuel for the competition is?"),odgovori258, "With cetane number = 100.", null, null);
				lista_pitanja.add(q258);
				
				//PITANJE 259
				List <String> odgovori259=new ArrayList<String>();
				odgovori259.add("Vehicle doesn't need to be prepared for the race during the Engineering Design Event.");
				odgovori259.add("The presented vehicle cannot be dismantled during Engineering Design Event.");
				odgovori259.add("The team can be penalized for not being capable of explaining the general design of the vehicle.");
				Question q259=new RadioButtonQ (new JLabel("What is correct?"),odgovori259, "The team can be penalized for not being capable of explaining the general design of the vehicle.", null, null);
				lista_pitanja.add(q259);
				
				//PITANJE 260
				List <String> odgovori260=new ArrayList<String>();
				odgovori260.add("Volume of 90 ml.");
				odgovori260.add("Volume of 0.1 l.");
				odgovori260.add("Volume of 100 cl");
				Question q260=new RadioButtonQ (new JLabel("If a cooling system has a 900 ml of plain water, a catch can has to have?"),odgovori260, "Volume of 0.1 l.", null, null);
				lista_pitanja.add(q260);
				
				//PITANJE 261
				ImageIcon slika33icon=new ImageIcon("sources/slika33.png");
				JLabel slika33=new JLabel(slika33icon);
				List <String> odgovori261=new ArrayList<String>();
				odgovori261.add("74.492 MPa");
				odgovori261.add("78.364 MPa");
				odgovori261.add("82.468 Mpa");
				odgovori261.add("86.682 MPa");
				Question q261=new RadioButtonQ (new JLabel(""),odgovori261, "74.492 MPa", slika33, null);
				lista_pitanja.add(q261);
				
				//PITANJE 262
				ImageIcon slika34icon=new ImageIcon("sources/slika34.png");
				JLabel slika34=new JLabel(slika34icon);
				List <String> odgovori262=new ArrayList<String>();
				odgovori262.add("12630");
				odgovori262.add("13211");
				odgovori262.add("14111");
				odgovori262.add("14650");
				Question q262=new RadioButtonQ (new JLabel(""),odgovori262, "13211", slika34, null);
				lista_pitanja.add(q262);
				
				
				//PITANJE 263
				List <String> odgovori263=new ArrayList<String>();
				odgovori263.add("40");
				odgovori263.add("100");
				odgovori263.add("160");
				odgovori263.add("80");
				Question q263=new RadioButtonQ (new JLabel("<html> A weight falls on a collar rigidly attached to the lower end of a vertical bar 5m long and 800 mm2 in section. <br/> If the maximum instantaneous extension is 2mm, then stress in the bar in MPa will be (Take E = 200 GPa) </html>?"),odgovori263, "80", null, null);
				lista_pitanja.add(q263);
				
				//PITANJE 264
				List <String> odgovori264=new ArrayList<String>();
				odgovori264.add("50");
				odgovori264.add("56");
				odgovori264.add("40");
				odgovori264.add("72");
				Question q264=new RadioButtonQ (new JLabel("<html>A hollow shaft is subjected to a torque of 40 kN-m and a bending moment of 60 kN-m. <br/>Equivalent torque in kN-m will be: </html>?"),odgovori264, "72", null, null);
				lista_pitanja.add(q264);
				
				//PITANJE 265
				List <String> odgovori265=new ArrayList<String>();
				odgovori265.add("50");
				odgovori265.add("56");
				odgovori265.add("40");
				odgovori265.add("72");
				Question q265=new RadioButtonQ (new JLabel("<html>A hollow shaft is subjected to a torque of 40 kN-m and a bending moment of 60 kN-m. <br/>Equivalent torque in kN-m will be: </html>?"),odgovori265, "72", null, null);
				lista_pitanja.add(q265);
				
				//PITANJE 266
				List <String> odgovori266=new ArrayList<String>();
				odgovori266.add("6.7");
				odgovori266.add("93.3");
				odgovori266.add("50");
				odgovori266.add("43.3");
				Question q266=new RadioButtonQ (new JLabel("<html>A thin cylindrical tube 100mm internal diameter and 6 mm thick<br/>is closed at the ends and is subjected to an internal pressure of 8MN/mm2. <br/> If torsional shear stress applied to the tube is 40 MN/m2, then the maximum shear stress in MN/m2 will be: </html>?"),odgovori266, "43.3", null, null);
				lista_pitanja.add(q266);
				
				//PITANJE 267
				List <String> odgovori267=new ArrayList<String>();
				odgovori267.add("0.56 m/s");
				odgovori267.add("0.28 m/s");
				odgovori267.add("0.42 m/s");
				odgovori267.add("0.36 m/s");
				Question q267=new RadioButtonQ (new JLabel("<html>The distance between two parallel shaft is 20 mm and they are connected by an Oldham's coupling. <br/> The driving shaft revolves at 200 rpm. What will be the maximum speed of sliding of the tongue <br/> of the intermediate piece along its groove?</html>"),odgovori267, "0.42 m/s", null, null);
				lista_pitanja.add(q267);
				
				//PITANJE 268
				List <String> odgovori268=new ArrayList<String>();
				odgovori268.add("4.65");
				odgovori268.add("18,67");
				odgovori268.add("8,23");
				odgovori268.add("9,33");
				Question q268=new RadioButtonQ (new JLabel("<html>A motor shaft consists of a tube 50 mm external diameter and 4mm thick. <br/> The engine develops 12 kW at 2000 rpm. If the power is transmitted through 4:1 gearing, then the maximum stress (MPa) <br/> in the tube will be? </html>"),odgovori268, "72", null, null);
				lista_pitanja.add(q265);
				
				//PITANJE 269
				List <String> odgovori269=new ArrayList<String>();
				odgovori269.add("65000 N/mm2");
				odgovori269.add("70000 N/mm2");
				odgovori269.add("75000 N/mm2");
				odgovori269.add("80000 N/mm2");
				Question q269=new RadioButtonQ (new JLabel("<html>A bar of 20 mm diameter is tested in tension. When a load of 38 kN was applied extension of 0.12 mm <br/> was measured over a length of 200 mm and contraction in diameter was 0.004 mm. <br/> If Young's modulus is 2 x 10^5 N/mm2 then the value of modulus of rigidity is: </html>"),odgovori269, "75000 N/mm2", null, null);
				lista_pitanja.add(q269);
	}
	

	

}
