public class Rectangle {
	private int _width, _length;
	

	/**
	 * @return Returns the _length.
	 */
	public int get_length() {
		return _length;
	}
	/**
	 * @param _length The _length to set.
	 */
	public void set_length(int length) {
		_length = length;
	}
	/**
	 * @return Returns the _width.
	 */
	public int get_width() {
		return _width;
	}
	/**
	 * @param _width The _width to set.
	 */
	public void set_width(int width) {
		_width = width;
	}
	
	public int computeArea() {
		int area;
		area = _length * _width;
		
		return area;
	}
	
	public int computePerimeter() {
		int perimeter;
		perimeter = 2*(_width + _length);
		
		return perimeter;
	}
}
