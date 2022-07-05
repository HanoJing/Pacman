package Map;

import java.awt.*;

		public class Dots {
			public int size = 5;
			public int x;
			public int y;
			public int[] xW = new int[27];
			public int[] yW = new int[15];

			public Dots() {
				int i = 0;
				int j = 0;

				for(this.x = -25; this.x < 1325; this.x += 50) {
					this.xW[i] = this.x;
					++i;
				}

				for(this.y = -25; this.y < 725; this.y += 50) {
					this.yW[j] = this.y;
					++j;
				}

			}

			public void drawDots(Graphics g) {
				for(this.y = 25; this.y < 650; this.y += 50) {
					for(this.x = 25; this.x < 1240; this.x += 50) {
						g.setColor(Color.WHITE);
						g.fillOval(this.x, this.y, this.size, this.size);
					}
				}

			}



	}

