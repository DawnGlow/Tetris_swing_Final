package model.VersusMode;

import java.awt.*;

public class BlockChunk {

    public int HEIGHT = 10;
    public int WIDTH = 10;
    // 대전모드용 변수들
    public int[][] attackBlock;

    public int grayLinesNum; 			// attackBlock에 쌓여있는 줄의 수

    public BlockChunk() {
        attackBlock = new int[HEIGHT][WIDTH];
        grayLinesNum = 0;
    }


}
