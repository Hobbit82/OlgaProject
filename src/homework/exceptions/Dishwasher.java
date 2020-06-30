package homework.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Dishwasher {

    private int maxCapacity;

    private boolean switchOn = false;

    private List<Dish> dishes = new ArrayList<Dish>();

    private DishwasherState state = DishwasherState.STOPPED;


    public Dishwasher(int capacity) {
        if (capacity <= 0) {
            throw new DishwasherRuntimeException("capacity couldn`t be negative or equal to 0");
        }
        maxCapacity = capacity;
    }

    /**
     * Machine loading
     * @param dish
     * @throws DishwasherException
     */
    public void load(Dish dish) throws DishwasherException {
        if (state == DishwasherState.STARTED) {
            throw new DishwasherException("loading is not allowed due to machine is started");
        }
        if (state == DishwasherState.FINISHED) {
            if (dishes.size() > 0) {
                throw new DishwasherException("loading is not allowed due to washing is finished and machine is not empty.");
            }
        }
        dishes.add(dish);
    }

    /**
     * Get all dishes
     * @return
     */
    public List<Dish> getAllDishes() {
        return dishes;
    }

    /**
     * Start machine
     * @throws DishwasherException
     */
    public void start() throws DishwasherException {
        if (dishes.isEmpty()) {
            throw new DishwasherException("start is not allowed due to machine is empty");
        }
        if (state == DishwasherState.FINISHED) {
            if (dishes.size() > 0) {
                throw new DishwasherException("start is not allowed due to washing is finished and machine is not empty.");
            }
        }
        if (state == DishwasherState.STARTED) {
            throw new DishwasherException("start is not allowed due to washing is started");
        }
        state = DishwasherState.STARTED;
    }

    /**
     * Stop machine
     * @throws DishwasherException
     */
    public void stop() throws DishwasherException {
        if (state != DishwasherState.STARTED) {
            throw new DishwasherException("stop is not allowed due to washing is not started");
        }

        state = DishwasherState.STOPPED;
    }
}
