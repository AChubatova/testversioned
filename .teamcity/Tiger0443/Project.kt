package Tiger0443

import Tiger0443.buildTypes.*
import Tiger0443.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0443")
    name = "Tiger0443"

    vcsRoot(Tiger0443_cVCSroot)

    buildType(Tiger0443_Hi3)
    buildType(Tiger0443_Hi2)
    buildType(Tiger0443_Hi1)
    buildType(Tiger0443_Hi0)
})
