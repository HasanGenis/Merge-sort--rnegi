public class MergeSort {

	private void merge(Double arr[], String[] arr_tarih, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		Double L[] = new Double[n1];
		Double R[] = new Double[n2];
		
		String L_s[] = new String[n1];
		String R_s[] = new String[n2];
		
		for (int i=0; i<n1; ++i) {
			L[i] = arr[l + i];
			L_s[i] = arr_tarih[l + i];
		}
		for (int i=0; i<n2; ++i) {
			R[i] = arr[m+1+i];
			R_s[i] = arr_tarih[m+1+i];
		}
		
		int i = 0, j = 0;
		
		int k = l;
		while(i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				arr_tarih[k] = L_s[i];
				i++;
			}
			else {
				arr[k] = R[j];
				arr_tarih[k] = R_s[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			arr_tarih[k] = L_s[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			arr_tarih[k] = R_s[j];
			j++;
			k++;
		}
	}

	public void sort(Double arr[], String[] arr_tarih, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			
			sort(arr,arr_tarih,l,m);
			sort(arr,arr_tarih,m+1,r);
			merge(arr,arr_tarih,l,m,r);
		}
	}
	
}
