import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class _04_ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());
		Map<String, Map<String, Integer>> log = new Hashtable<String, Map<String, Integer>>();
		for (int i = 0; i < n; i++) {
			String[] line = in.nextLine().split(" ");

			if (log.containsKey(line[1])) {
				Map<String, Integer> ip_time_internal = new Hashtable<String, Integer>();
				ip_time_internal = log.get(line[1]);
				if (ip_time_internal.containsKey(line[0])) {
					Integer time = ip_time_internal.get(line[0]);
					time = time + Integer.parseInt(line[2]);
					ip_time_internal.replace(line[0], time);
				} else {
					ip_time_internal.put(line[0], Integer.parseInt(line[2]));
					log.replace(line[1], ip_time_internal);
				}
			} else {
				Map<String, Integer> ip_time = new Hashtable<String, Integer>();
				ip_time.put(line[0], Integer.parseInt(line[2]));
				log.put(line[1], ip_time);
			}

		}
		SortedSet<String> keys = new TreeSet<String>(log.keySet());
		for (String name : keys) {
			Map<String, Integer> ip_time = log.get(name);
			Integer allTime = 0;
			ArrayList<String> ips = new ArrayList<String>();
			SortedSet<String> keysIP = new TreeSet<String>(ip_time.keySet());
			for (String ip : keysIP) {
				Integer time = ip_time.get(ip);
				allTime = allTime + time;
				ips.add(ip);
			}
			String str = "";
			for (int i = 0; i < ips.size(); i++) {
				if (i > 0)
					str = str + ", ";
				str = str + ips.get(i);
			}
			System.out.println(name + ": " + allTime + " [" + str + "]");
		}

	}

}
