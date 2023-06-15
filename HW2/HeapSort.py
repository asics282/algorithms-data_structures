from random import randint

# заполнение массива случайными неповторяющимися числами от 1 до 50
def random_array(n):
    array = []
    for i in range(n):
        array.append(randint(1, 51))
        array_temp = set(array)
    return list(array_temp)

def heapify(array, heap_size, root_index):
    largest = root_index # инициализируем наибольший элемент, как корень
    left = 2*root_index + 1
    right = 2*root_index + 2

    # если левый дочерний элемент больше корня
    if (left < heap_size and array[left] > array[largest]):
        largest = left

    #  если правый дочений элемент больше, чем самый большой элемент на данный момент
    if (right < heap_size and array[right] > array[largest]):
        largest = right

    # если самый большой элемент не корень
    if largest != root_index:
        temp = array[root_index]
        array[root_index] = array[largest]
        array[largest] = temp

        heapify(array, heap_size, largest)

def heap_sort(array):
    # построение кучи
    for i in range(len(array)//2 - 1, -1, -1):
        heapify(array, len(array), i)

    for i in range(len(array)-1, -1, -1):
        temp = array[0]
        array[0] = array[i]
        array[i] = temp 

        heapify(array, i, 0)

def main():
    print('Программа для пирамидальной сортировки массива')
    while(True):
        n = int(input("Введите размер массива от 1 до 10: "))
        if n in range(1, 11):
            a = random_array(n)
            print(f'Исходный массив: {a}')
            heap_sort(a)
            print(f'Отсортированный массив: {a}')
            break
    print('Для завершения работы программы нажмите "Enter" ...')
    input()
main()