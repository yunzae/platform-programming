package org.example;
import javax.persistence.*;
import java.util.List;
import java.util.Optional;

public class JDBCTemplateTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pnu.cse");
        EntityManager em = emf.createEntityManager();
        PlayerRepository<Player, Long> playerRepository = new PlayerRepository<>(Player.class, em);
        List<Player> player = playerRepository.findByClubId(18503L);
        for(Player pl :player){
            System.out.println(pl);
        }

        em.close(); emf.close();

    }

}

//201824446 김윤재