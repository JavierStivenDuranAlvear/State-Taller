
package co.unicauca.ordermanagement.domain.states;

import co.unicauca.ordermanagement.domain.Order;

/**
 * Estado Pagado
 * 
 * @author Javier Stiven Duran Alvear - Luis Miguel Arango
 */
public class PayedStated extends OrderState{

    /**
     * constructor
     * @param order 
     */
    public PayedStated(Order order) {
        super(order);
    }
    
    /**
     * @return estado
     */
    @Override
    public String getStateDescription() {
        return "Pagada";
    }
    
    /**
     * @param parcelNumber
     * @return estado de la orden
     */
    @Override
    public OrderState orderSendOut(String parcelNumber) {
        return new SendState(getOrder());
    }
}



