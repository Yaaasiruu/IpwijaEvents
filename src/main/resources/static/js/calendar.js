document.addEventListener('DOMContentLoaded', function () {

    const calendarEl = document.getElementById('calendar');

    if (!calendarEl) {
        return;
    }

    const calendar = new FullCalendar.Calendar(calendarEl, {

        locale: 'id',

    buttonText: {
        today: 'Hari Ini',
        month: 'Bulan',
        week: 'Minggu',
        day: 'Hari'
    },

    headerToolbar: {
        left: 'prev,next today',
        center: 'title',
        right: 'dayGridMonth,timeGridWeek,timeGridDay'
    },

        selectable: true,
        navLinks: true,

        dateClick: function (info) {
            alert('Tanggal dipilih: ' + info.dateStr);
        },

        eventClick: function (info) {
            alert(
                'Event: ' +
                info.event.title +
                '\nTanggal: ' +
                info.event.start.toLocaleDateString('id-ID')
            );
        },

        events: [
            {
                title: 'Workshop UI/UX Design',
                start: '2026-07-15'
            },
            {
                title: 'Seminar Artificial Intelligence',
                start: '2026-07-20'
            },
            {
                title: 'Leadership Camp',
                start: '2026-07-25'
            },
            {
                title: 'Workshop Web Development',
                start: '2026-07-14'
            }
        ]

    });

    calendar.render();

});