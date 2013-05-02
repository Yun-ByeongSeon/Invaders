package engine;

/**
 * Imposes a cooldown period between two actions.
 * 
 * @author <a href="mailto:RobertoIA1987@gmail.com">Roberto Izquierdo Amo</a>
 * 
 */
public class Cooldown {

	private int milliseconds;
	private long time;

	/**
	 * Constructor, established the time until the action can be performed
	 * again.
	 * 
	 * @param milliseconds
	 *            Time until cooldown period is finished.
	 */
	public Cooldown(int milliseconds) {
		this.milliseconds = milliseconds;
		this.time = 0;
	}

	/**
	 * Checks if the cooldown is finished.
	 * 
	 * @return Cooldown state.
	 */
	public boolean checkFinished() {
		if (this.time == 0
				|| this.time + this.milliseconds < System.currentTimeMillis())
			return true;
		return false;
	}

	/**
	 * Restarts the cooldown.
	 */
	public void reset() {
		this.time = System.currentTimeMillis();
	}
}
