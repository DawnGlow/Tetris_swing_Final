package model.blocks;

import java.awt.Color;

public class TBlock extends Block {
	
	public TBlock() {
		shape = new int[][] { 
				{0, 1, 0},
				{1, 1, 1},
		};
		color = Color.MAGENTA;
		text = "O";
		rotate_status=1;
	}

	public TBlock(boolean color_blind, int pattern) {
		shape = new int[][] {
				{0, 1, 0},
				{1, 1, 1},
		};
		if(color_blind) color = new Color(204,121,167);
		else color = Color.MAGENTA;
		text="O";

		rotate_status=1;
	}

	//TBlock 회전 시 변경되어야 할 x, y 위치
	@Override
	public int rotate_x(){
		int rotate_x;
		switch (rotate_status){
			case 1:
				rotate_x=1;
				break;
			case 2:
				rotate_x=-1;
				break;
			case 3:
				rotate_x=0;
				break;
			case 4:
				rotate_x=0;
				break;
			default:
				rotate_x=0;
				break;
		}
		return rotate_x;
	}

	@Override
	public int rotate_y(){
		int rotate_y;
		switch (rotate_status){
			case 1:
				rotate_y=0;
				break;
			case 2:
				rotate_y=1;
				break;
			case 3:
				rotate_y=-1;
				break;
			case 4:
				rotate_y=0;
				break;
			default:
				rotate_y=0;
				break;
		}
		return rotate_y;
	}
}
