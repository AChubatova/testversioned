package Tiger01024

import Tiger01024.buildTypes.*
import Tiger01024.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01024")
    name = "Tiger01024"

    vcsRoot(Tiger01024_cVCSroot)

    buildType(Tiger01024_Hi1)
    buildType(Tiger01024_Hi0)
    buildType(Tiger01024_Hi3)
    buildType(Tiger01024_Hi2)
})
