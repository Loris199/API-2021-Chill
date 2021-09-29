package ch.heigvd.res.chill.domain.Loris199;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Milk implements IProduct {

  public final static String NAME = "Milk";
  public final static BigDecimal PRICE = new BigDecimal(1.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
