 //Volume / Density Factor = Volumetric Equivalent Actual Weight (VE)
 //Got this formula from CanadaPost website ABCs of Mailing  

double volume = (widthCm * heightCm * lengthCm); 
double volumetricEquil = (volume / DENSITY_FACTOR);

// round to the nearest 0.5 formula found online  
double volRounded = Math.round(volumetricEquil * 2) / 2.0;        
double weiRounded = Math.round(weight * 2) / 2.0;
                        
if (weight >= volumetricEquil) 
{
    System.out.println("The shipping charge will be based on package weight.");
    System.out.printf("Look up weight row " + Math.max(weiRounded, SHIPPING_MINIMUM));         }
else 
{ 
    System.out.println("The shipping charge will be based on volumetric equivalent of weight.");
    System.out.printf("Look up weight row " + Math.max(volRounded,SHIPPING_MINIMUM ));
}                                             

// only take three letter of the postal code 
System.out.format("%nForward Sortation Area: "); 
String upper = postal.toUpperCase();
System.out.print(upper.substring(0,SUB_THREE));