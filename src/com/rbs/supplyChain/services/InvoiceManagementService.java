package com.rbs.supplyChain.services;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/invoice")
public class InvoiceManagementService {
	@POST
	@Path("/search")
	@Produces(MediaType.TEXT_HTML)
	public Response searchByInvoiceNo(@FormParam("invoiceNo") String invoiceNo){
		String responseString = "<h1>Search Invoice By number</h1><hr><strong>Searched Invoice is:</strong>"+ invoiceNo;
		return Response.status(200).entity(responseString).build();
	}
	
	@POST
	@Path("/addInvoice")
	@Produces(MediaType.TEXT_HTML)
	public Response addInvoice(@FormParam("invoiceNo") String invoiceNo,
			@FormParam("sellerId") String sellerId,
			@FormParam("buyerId") String buyerId){
		String responseString = "<h1>Add Invoice</h1><hr><strong><h1>Added Invoice with..</h1><br> Invoice No:</strong>"+ invoiceNo
				+"<br>Seller Id"+sellerId+"<br>Buyer Id"+buyerId;
		return Response.status(200).entity(responseString).build();
		
	}
	
	@POST
	@Path("/viewInvoices")
	@Produces(MediaType.TEXT_HTML)
	public Response viewAllInvoices(@FormParam("id") String id){
		String responseString = "<h1>View Invoice</h1><hr><strong>All the Invoices for buyer/seller id :</strong>"+ id+" are as follows<hr>";
		return Response.status(200).entity(responseString).build();
	}
	
	@POST
	@Path("/update")
	@Produces(MediaType.TEXT_PLAIN)
	public Response updateInvoice(@FormParam("invoiceNo") String invoiceNo){
		String responseString = "<h1>Update Invoice</h1><hr><strong>In update method for InvoiceNo is:</strong>"+ invoiceNo;
		return Response.status(200).entity(responseString).build();
	}
	
	@POST
	@Path("/delete")
	@Produces(MediaType.TEXT_PLAIN)
	public Response deleteInvoice(@FormParam("invoiceNo") String invoiceNo){
		String responseString = "<h1>Delete Invoice</h1><hr><strong>In delete method for InvoiceNo is:</strong>"+ invoiceNo;
		
		return Response.status(200).entity(responseString).build();
	}
	
	@POST
	@Path("/approve")
	@Produces(MediaType.TEXT_PLAIN)
	public Response approveInvoice(@FormParam("invoiceNo") String invoiceNo){
		String responseString = "<h1>Approve Invoice</h1><hr><strong>In Approve method for InvoiceNo is:</strong>"+ invoiceNo;
		return Response.status(200).entity(responseString).build();
	}
	
	@POST
	@Path("/upload")
	@Produces(MediaType.TEXT_PLAIN)
	public Response uploadInvoice(@FormParam("invoiceNo") String invoiceNo){
		String responseString = "<h1>Upload Invoice</h1><hr><strong>In uplaod method for InvoiceNo is:</strong>"+ invoiceNo;
		return Response.status(200).entity(responseString).build();
	}
	
	
}