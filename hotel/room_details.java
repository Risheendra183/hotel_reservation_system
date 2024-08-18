// Source code is decompiled from a .class file using FernFlower decompiler.
class room_details extends avail_rooms {
   room_details() {
   }

   public void room(int var1, String var2) {
      if (var2.equals("single") && var1 > single_avail_rooms) {
         System.out.println("Sorry, not enough available rooms. Single available rooms: " + single_avail_rooms);
         System.exit(0);
      } else if (var2.equals("suite") && var1 > suite_avail_rooms) {
         System.out.println("Sorry, not enough available rooms. Suite available rooms: " + suite_avail_rooms);
         System.exit(0);
      } else if (var2.equals("single")) {
         if (var1 <= 0) {
            return;
         }

         single_avail_rooms -= var1;
         System.out.println("single_avail_rooms: " + single_avail_rooms);
         System.out.println("suite_avail_rooms: " + suite_avail_rooms);
      } else if (var2.equals("suite") && var1 > 0) {
         if (var1 <= 0) {
            return;
         }

         suite_avail_rooms -= var1;
         System.out.println("suite_avail_rooms: " + suite_avail_rooms);
         System.out.println("single_avail_rooms: " + single_avail_rooms);
      } else {
         System.out.println("Sorry for the inconvenience. Available rooms are only single and suite.");
         System.exit(0);
      }

   }
}
