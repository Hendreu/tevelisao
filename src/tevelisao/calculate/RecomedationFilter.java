package tevelisao.calculate;

public class RecomedationFilter {
    private String recomendation;

    public void filter(Classificate classificated){
        if (classificated.getClassification() >= 4 ) {
            System.out.println("Está entre os preferidos do momento");
        }else if (classificated.getClassification() >= 2){
            System.out.println("Muito bem avaliado!");
        } else {
            System.out.println("Assista em breve!");
        }
    }
}
