const {getEvenNumbers, createCounter} = require('./functions');

describe('getEvenNumbers', () => {
  it('should return an array of even numbers from the input array', () => {
    const input = [1, 2, 3, 4, 5, 6];
    const expectedOutput = [2, 4, 6];
    expect(getEvenNumbers(input)).toEqual(expectedOutput);
  })

  test('that the initial count is 0', () => {
    const counter = createCounter()
    expect(counter.getCount()).toBe(0);
  })

  test('that count can be increased by 1', () => {
    const counter = createCounter()
    counter.increment()
    expect(counter.getCount()).toBe(1);
  })
  test('that the counter can be increased multiple times', () => {
    const counter = createCounter();
    counter.increment()
    counter.increment()
    expect(counter.getCount()).toBe(2);
  });
  test('that counter can be decreased by 1', () => {
    const counter = createCounter();
    counter.increment()
    counter.decrement()
    expect(counter.getCount()).toBe(0)
  });
  test('that counter can be reset to 0', () => {
    const counter = createCounter();
    expect(counter.getCount()).toBe(0);
  })
});
