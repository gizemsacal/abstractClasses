import java.sql.SQLOutput;

public abstract class GameCalculator {
    public abstract void hesapla();

    public void gameOver(){
        System.out.println("Oyun bitti.");
    }
    /* public lerin yanına abstract koymak şu demek GameCalculator' u kim
    kullanıyorsa gameOver'ı olduğu gibi kullanmak zorunda bu hiç bir zaman
    değişmeyecek bir kuraldır fakat hesapla() ' ya gelince, kim implement ediyorsa
    hesaplayı içermek zorunda fakat hesapla()' yı override etmek zorunda yani
    kendi hesapla()' sını yazmak zorunda işte böyle durumlarınız varsa yani hesapla()'
    var ve bu hesapla()'yı ben zorunlu kılıyorum. Çünkü tüm oyun oynayanlar için
    hesaplamama ve puanlama olmak zorundadır. Ama bunu kullanıcı türüne göre herkes override
    edecektir.
     */
}
