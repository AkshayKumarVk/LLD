package org.example.low_level_design.lld2.singleton.assignments.file_based_connection_manager;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
	public static FileBasedConfigurationManagerImpl instance;

	private FileBasedConfigurationManagerImpl() {
    }


   @Override
   public String getConfiguration(String key) {
	  // TODO Auto-generated method stub
//	  throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
		return (String) properties.get(key);
   }

   @Override
   public <T> T getConfiguration(String key, Class<T> type) {
	  // TODO Auto-generated method stub
	  throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
   }

   @Override
   public void setConfiguration(String key, String value) {
	  // TODO Auto-generated method stub
	  throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
   }

   @Override
   public <T> void setConfiguration(String key, T value) {
	  // TODO Auto-generated method stub
	  throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
   }

   @Override
   public void removeConfiguration(String key) {
	  // TODO Auto-generated method stub
	  throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
   }

   @Override
   public void clear() {
	  // TODO Auto-generated method stub
//	  throw new UnsupportedOperationException("Unimplemented method 'clear'");

   }

   public static FileBasedConfigurationManager getInstance() {
	  // TODO Auto-generated method stub
//	  return null;
	  if(instance==null){
		 synchronized (FileBasedConfigurationManagerImpl.class){
			if(instance==null){
			   instance=new FileBasedConfigurationManagerImpl ();
			}
		 }
	  }
	  return instance;
   }

   public static void resetInstance() {
	  // TODO Auto-generated method stub
	  instance=null;
   }

}