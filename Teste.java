public class Teste {
    public static void main(String[] args) {
        Veiculo honda = new Veiculo();
        honda.setCor("vermelho");
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setPlaca("AAA99A9");
        honda.setQtdRodas(4);
        honda.setVelMaxima(260);

        Motor motorDoHonda = honda.getMotor();

        motorDoHonda.setPotencia(300);
        motorDoHonda.setQtdPist(8);

        System.out.println(honda.getMotor());
        System.out.println(honda.getCor());
        System.out.println(honda.getMarca());
        System.out.println(honda.getModelo());
        System.out.println(honda.getPlaca());
        System.out.println(honda.getQtdRodas());
        System.out.println(honda.getVelMaxima());
        System.out.println(motorDoHonda.getPotencia());
        System.out.println(motorDoHonda.getQtdPist());

    }
}
