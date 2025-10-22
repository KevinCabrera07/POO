public class punto1 {    
    public static void main(String[]args){
        double d1 = 42.0;
        double d2 = 58.5;
        double d3 = 37.2;
        double t1 = 0.9;
        double t2 = 1.4;
        double t3 = 0.8;
        double l1 = 5.1;
        double l2 = 6.9;
        double l3 = 4.3;
        double precioLitro = 1.35;
        double masaCargaKg = 1200;
        double largo = 2.0;
        double ancho = 1.2;
        double alto = 1.1;
        double p1 = 2.5;
        double p2 = 3.0;
        double p3 = 2.0;
        double deprecPorKm = 0.08;
        double volCamionM3 = 10.0;
        double fCO2 = 2.68;
        double galPorLitro = 0.264;
        int  vmin = 30;
        int  vmax = 90 ;
        int va = 40;
        int vb = 80;
        double ca=0.05;
        double cb=0.09;
        double a=-0.0008;
        double b=0.08;
        double c=4.0;
    
     System.out.println(d1/t1);
     System.out.println(d2/t2);
     System.out.println(d3/t3);
      double v1=46.67;
      double v2=41.79;
      double v3=46.50;
      System.out.println((d1*v1+d2*v2+d3*v3)/(d1+d2+d3));
      double vprom=44.55;
      System.out.println(d1/l1);
      System.out.println(d2/l2);
      System.out.println(d3/l3);
      double kml1=8.24;
      double kml2=8.48;
      double kml3=8.65;
      System.out.println((d1+d2+d3)/(l1+l2+l3));
      double kmltotal=8.448;
      System.out.println((l1+l2+l3)*precioLitro);
      double Comb=22.01;
      System.out.println((d1+d2+d3)*deprecPorKm);
      double Dep=11.02;
      System.out.println((p1+p2+p3));
      double Peaje=7.50;
      System.out.println(Comb+Dep+Peaje);
      double Directo = 40.521;
      System.out.println(Directo/(d1+d2+d3));
      double km = 0.294;
      System.out.println((largo*ancho*alto));
      double Volumen = 2.640;
      System.out.println((masaCargaKg/Volumen));
      double Densidad = 454.55;
      System.out.println(Volumen/volCamionM3);
      double Ocupación = 0.264;
      System.out.println((l1+l2+l3)*fCO2);
      double CO2Total=43.68;
      System.out.println(CO2Total/(d1+d2+d3));
      double CO2porKm=0.317;
       System.out.println((l1+l2+l3)*galPorLitro);         
      double GalTotal=4.3032;
      System.out.println((vprom-vmin)/(vmax-vmin));
      double vnorm=0.242;
      System.out.println((v1+v2+v3)/3);
      double vmedia=44.984;
      System.out.println(Math.sqrt(((Math.pow(v1-vmedia,2))+(Math.pow(v2-vmedia,2))+(Math.pow(v3-vmedia,2)))/3));
      double sigma=2.263;
      System.out.println((t1*v1+t2*v2+t3*v3)/(t1+t2+t3));
      double vpond_t=44.419;
      System.out.println(ca + (cb - ca) * (vprom - va) / (vb - va));
      double cvprom=0.05455;
      System.out.println(cvprom * (d1 + d2 + d3));
      double costoMant=7.511;
       System.out.println(a * (vprom * vprom) + b * vprom + c);
        double kmlModelo=5.976;
      System.out.println((d1+d2+d3)/kmlModelo);
      double litrosModelo=23.041;
      double w1=0.25;
      double w2=0.25;
      double w3=0.25;
      double w4=0.25;
      System.out.println((w1+w2+w3+w4));
      System.out.println(w1*(1/km) + w2*kmltotal + w3*(1/CO2porKm) + w4*(1/(1+sigma)));




    }
}