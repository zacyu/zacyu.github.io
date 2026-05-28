(() => {
    const ready = (fn) => {
        if (document.readyState != "loading") {
            fn();
        } else {
            document.addEventListener("DOMContentLoaded", fn);
        }
    };

    ready(() => {
        try {
            const note = document.getElementById("ftf-dma-note");
            const noteCloseButton = document.getElementById("ftf-dma-close-btn");

            if (note !== null && noteCloseButton !== null) {
                noteCloseButton.onclick = (ev) => {
                    note.classList.add("d-none");
                };
            }

            if (note !== null) {
                setTimeout(() => {
                    note.classList.remove("ftf-dma-note-hidden");
                }, 2000);
            }
        } catch (error) {
            /* noop */
        }
    });
})();