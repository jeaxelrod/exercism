class Array
  def accumulate  
    self.each_index { |index| self[index] = yield(self[index]) }
  end
end
