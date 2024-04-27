public class main {
    public static double tinhChiPhiPhanMem(double TAW, double TBF, double TFW, double EFW,
                                            double g, double n, double c, double f1,
                                            double P, double tLC, double tLTL) {
        double UUCP = TAW + TBF;
        double TCF = 0.6 + 0.01 * TFW;
        double EF = 1.4 + (-0.03 * EFW);
        double AUCP = UUCP * TCF * EF;
        double E = (10.0 / 6.0) * AUCP;
        double f2 = 0.12 * f1;
        double f = f1 + f2;
        double H = g * Math.pow(n, c) * (1 + f);
        double G = 1.4 * E * P * H;
        double C = G * tLC;
        double TL = (G + C) * tLTL;
        double GPM = G + C + TL;
        return GPM;
    }

    public static void main(String args[]) {
        double abb = tinhChiPhiPhanMem(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
        System.out.println(abb);
    }
}
