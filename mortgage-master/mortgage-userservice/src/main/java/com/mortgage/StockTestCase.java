/*
 * package com.hcl.inventory;
 * 
 * import static org.junit.Assert.*;
 * 
 * import java.sql.Connection; import java.sql.PreparedStatement; import
 * java.sql.ResultSet; import java.sql.SQLException;
 * 
 * 
 * import org.junit.Test;
 * 
 * 
 * 
 * public class StockTestCase {
 * 
 * 
 * @Test public void testPlaceOrder(){
 * assertEquals("Order Placed Successfully...", StockBAL.placeOrderBal("S002",
 * 2)); assertEquals("Insufficent Quantity...", StockBAL.placeOrderBal("S003",
 * 2000)); assertEquals("StockID not found...", StockBAL.placeOrderBal("f003",
 * 2000));
 * 
 * }
 * 
 * 
 * @Test public void testGenerateOrderId(){ Connection
 * con=DaoConnection.getConnection(); int orderid=0; String
 * cmd="select case when max(orderid) is null then 1" + " else max(orderid)+1 "
 * + "end orderid from orders"; try { PreparedStatement
 * pst=con.prepareStatement(cmd);
 * 
 * ResultSet rs=pst.executeQuery(); rs.next(); orderid=rs.getInt("orderid"); }
 * catch (SQLException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } assertEquals(orderid, StockBAL.generateOrderidBal());
 * }
 * 
 * 
 * @Test public void testSearchStock(){
 * assertNotNull(StockBAL.searchStockBal("S002"));
 * assertNull(StockBAL.searchStockBal("g999")); }
 * 
 * @Test public void testcreateStock(){ Stock stock=new Stock(); String
 * stockid=StockBAL.generateStockidBal(); stock.setStockid(stockid);
 * stock.setItemname("laptop"); stock.setPrice(100000.00);
 * stock.setQuantityavail(100.00); assertEquals("created successfully",
 * StockBAL.createStockBal(stock));
 * 
 * }
 * 
 * @Test public void testgenerateStockid(){ String stid=null; Connection
 * con=DaoConnection.getConnection(); String
 * cmd="Select max(stockId) sid from stock"; try { PreparedStatement
 * pst=con.prepareStatement(cmd); ResultSet rs=pst.executeQuery(); rs.next();
 * stid=rs.getString("sid"); int id=Integer.parseInt(stid.substring(1)); id++;
 * String formatted = String.format("%03d", id); stid="S"+formatted; } catch
 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * assertEquals(stid, StockBAL.generateStockidBal()); }
 * 
 * 
 * @Test public void testDaoConnection(){
 * assertNotNull(DaoConnection.getConnection()); }
 * 
 * @Test public void test() { Stock stock=new Stock(); stock.setStockid("S002");
 * stock.setItemname("laptop"); stock.setPrice(100000.00);
 * stock.setQuantityavail(100.00);
 * 
 * assertEquals("S002", stock.getStockid()); assertEquals("laptop",
 * stock.getItemname()); assertEquals(100000.00, stock.getPrice(),0.00);
 * assertEquals(100.00, stock.getQuantityavail(),0.00); }
 * 
 * }
 */