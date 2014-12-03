class PhoneNumber
  attr :number
  def initialize number
    @number = number.delete " ()-."
    @number = "000000000" unlesss valid_number?
  end

  private

  def valid_number?
  end               
end
