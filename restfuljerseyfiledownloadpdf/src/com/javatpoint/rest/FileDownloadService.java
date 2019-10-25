package com.javatpoint.rest;
import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
 
@Path("/files")
public class FileDownloadService {
 	private static final String FILE_PATH = "C:\\Users\\Coalesce\\Downloads\\apache-tomcat-8.5.42-windows-x64\\apache-tomcat-8.5.42\\webapps\\docs\\architecture\\startup\\serverStartup.pdf";
 
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getFile() {
 
		File file = new File(FILE_PATH);
 
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition","attachment; filename=\"serverStartup.pdf\"");
		return response.build();
 
	}
 }