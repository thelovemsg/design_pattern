package thread.readwritelock;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TestDTO {

    //각기 다름
    private int total;
    private int score;
    private int rank;

    //동률시
    private int V1;
    private int V2;
    private int V3;
}

